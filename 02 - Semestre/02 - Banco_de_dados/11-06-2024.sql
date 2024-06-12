/*create trigger trg_PreventCategoriaDeletion
on categoria
instead of delete
as
begin
	if exists (select 1 from Produto where Produto.CategoriaID in (select deleted.CategoriaId from Deleted))
	begin
		raiserror('Não é possível excluir categorias associadas a produtos.', 16, 1)
		rollback transaction
	end
	else
		delete from Categoria where Categoria.CategoriaID in (select deleted.CategoriaID from deleted)
end
*/
select * from Categoria

delete from Categoria where CategoriaID = 1 -- Vamos tentar apagar uma categoria que tenha produtos para que a mensagem de erro da trigger seja exibida

insert into Categoria(CategoriaID, NomeCategoria) values (13, 'Games')
-- vamos inserir uma nova categoria para o teste de exclusão

delete from Categoria where CategoriaID = 13 -- vamos excluir a nova categoria, neste caso a mesma deve ser excluída
-- já que não tem produtos vinculados

-- Registrar as alterações de preço em um log:
-- Registra alterações no preço dos produtos em uma tabela de log

create trigger trg_LogPrecoAlterado
on Produto
after update
as
begin
	insert into LogPreco(ProdutoID, NovoPreco, DataAlteracao)
	select ProdutoID, Preco, GETDATE()
	from inserted
end

create table LogPreco(
	ProdutoID int,
	NovoPreco decimal (10,2),
	DataAlteracao Date
);

-- Para que a tabela de log receba um registro vamos atualizar o preço de um produto
update Produto set Preco = 4100 where ProdutoID = 1

-- Vamos consultar a tabela de LogPreco e vemos se houve o registro da alteração
select * from LogPreco

-- Impedir a adição de produtos com preçõs acima de um limite
-- evita a adição de produtos com preços acima de um determinado valor

create trigger trg_LimitePreco
on Produto
instead of insert
as
begin
	if exists (select 1 from inserted where Preco > 10000)
	begin
		raiserror('O preço do produto não pode exceder $10.000.', 16, 1)
		rollback transaction
	end
	else
		insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
		select ProdutoID, NomeProduto, CategoriaID, Preco
		from inserted
end

-- Para testarmos a trigger basta tentar inserir um produto cujo o valor ultrapasse $10.000

insert into Produto values(15, 'Ultrabook', 8, 15800)

create PROC consulta_produto
as
select * from Produto
where NomeProduto like '%a%'

-- Para executar a stored procedure
exec consulta_produto

-- Exemplo 1: Procedure para inserir um novo produto: Cria uma Procedure para adicionar um novo
-- produto à tabela de Produtos

create PROCEDURE InserirNovoProduto
	@IDProd int,
	@Nome nvarchar(50),
	@CategoriaID int,
	@Preco decimal(10,2)
as
begin
	insert into Produto (ProdutoID, NomeProduto, CategoriaID, Preco)
	values(@IDProd, @Nome, @CategoriaID, @Preco)
end

-- Na execução
exec InserirNovoProduto 15, 'SmartWatch', 1, 2200

-- Para consultar
select * from Produto

-- Exemplo 2: Procedure para atualizar o preço de um produto: cria uma procedure para atualizar o preço de umproduto

create procedure AtualizarPrecoProduto
	@ProdutoID int,
	@NovoPreco decimal(10,2)
as
begin
	update Produto
	set Preco = @NovoPreco
	where ProdutoID = @ProdutoID
end

-- Na execução
exec AtualizarPrecoProduto 14, 2500 --ou
--exec AtualizarPrecoProduto @ProdutoID = 14, @NovoPreco = 2500

-- Para consultar
select * from Produto