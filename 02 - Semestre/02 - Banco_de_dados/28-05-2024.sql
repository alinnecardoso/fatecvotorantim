-- if...else

-- Inserção de dados condicional

select * from Produto
declare @CategoriaDesejada int = 1; -- Categoria desejada
if @CategoriaDesejada = 1
begin
	insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
	values(13, 'Tablet', @CategoriaDesejada, 1500);
end
select * from Produto

-- Exibição de Resultados Condicional

declare @ExibirResultados int = 1; -- 1 para exibir resultados, 0 para não exibir
if @ExibirResultados = 1
begin
	select ProdutoID, NomeProduto, CategoriaID, Preco
	from Produto
end

-- Exibição de Categorias com Else

declare @CategoriaID int = 1; -- Categoria desejada
declare @NomeCategoria nvarchar(50);
if exists (select * from Categoria where CategoriaID = @CategoriaID)
begin
	select @NomeCategoria = NomeCategoria from Categoria where
		CategoriaID = @CategoriaID;
		print 'Nome da Categoria: ' + @NomeCategoria;
end
else
begin
	print 'Categoria não encontrada.';
end

-- While

-- Suponha que você deseje incrementar o valor de um campo em cada linha de uma tabela

select * from Produto
declare @Counter int
set @Counter = 1

while @Counter <= 10
begin
	update Produto
	set Preco = Preco + 100
	where ProdutoID = @Counter
	set @Counter = @Counter + 1
end
select * from Produto

-- Atualização condicional de um loop, verificando condições de uma tabela

select * from Produto
declare @Counter int
set @Counter = 1

while @Counter <= (Select COUNT(*) from Produto)
begin
	declare @PrecoAtual decimal(10,2)
	select @PrecoAtual = Preco from Produto where ProdutoID = @Counter --Seleciona o preço do Produto

if @PrecoAtual > 1000 --Preço o valor do produto seja maior do 1000
begin
	update Produto
	set Preco = Preco * 1.1 --Aumenta em 10%
	where ProdutoID = @Counter
end

set @Counter = @Counter + 1

end
select * from Produto

-- Utilização do loop para processar registros em uma tabela baseada em uma condição

select * from Pedido
declare @PedidoDate date
set @PedidoDate = '2023-01-01'

while @PedidoDate <= '2023-10-31'
begin
	select * from Pedido where DataPedido = @PedidoDate

	set @PedidoDate = DATEADD(DAY, 1, @PedidoDate)
end
select * from Pedido