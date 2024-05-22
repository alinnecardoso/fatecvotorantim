-- Atualizar preço
-- Se der errado, desfaz todas as alterações para manter a consistencia dos dados

begin transaction

-- Aumenta os preços de todos os produtos em 10%
select * from Produto
update Produto
set Preco= Preco*1.1;

--Confirma a transação
commit;
select * from Produto


-- Inserir categoria e produtos ao mesmo tempo
-- Ambas serão tratadas comu uma única unidade

begin transaction

-- Insere novas categorias
select * from Categoria
insert into Categoria(CategoriaID, NomeCategoria)
values (11, 'Decoração'),
(12, 'Automóveis');

-- Insere novos produtos nas novas categorias
select * from Produto
insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
values(11, 'Vaso Decorativo', 11, 30),
(12, 'Pneu de Carro', 12, 100);

-- Confirma a transação
commit;
select * from Categoria
select * from Produto

-- Inserção de Dados incorretos

begin transaction

-- Inserindo dados incorretos
select * from Produto
insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
values(11, 'Produto Errado', 100, 9999);
select * from Produto
-- Detectou um erro, então desfaz as operações
rollback;

begin transaction;

-- Atualização com erro
update Produto set CategoriaID = 100 where ProdutoID = 3;

-- Detectou um erro, então desfaz as operações
rollback;

begin transaction;

-- Atualização com erro
update Produto set CategoriaID = 100 where ProdutoID = 3;
if @@ERROR = 0
commit
else
rollback; -- detectou um erro, então desfaz as operações
print 'Atualização na Tabela Produto foi Cancelada'

-- categorização de Preços de Produtos

-- Usar case para categorizar produtos com base em seus preços.

select NomeProduto, Preco,
	case
		when Preco < 100 then 'Barato'
		when Preco >= 100 and Preco < 1000 then 'Médio'
		else 'Caro'
	end as CategoriaPreco
from Produto

-- definir Desconto com base na categoria

-- Aplicar descontos a produtos com base em suas categorias

select NomeProduto, CategoriaID, Preco,
	case CategoriaID
		when 1 then Preco * 0.9 -- Categoria Eletrônicos(10% de desconto)
		when 2 then Preco * 0.95 -- Categoria Roupas (5% de desconto)
		else Preco
	end as PrecoComDesconto
from Produto

-- Conversão de Valores de Categoria

-- Converter valores de categoria em nomes mais legiveis

select ProdutoID, CategoriaID,
	case CategoriaID
		when 1 then 'Eletrônicos'
		when 2 then 'Roupas'
		when 3 then 'Alimentos'
		else 'Desconhecida'
	end as NomeCategoria
from Produto;

-- Classificação Condicional de Pedidos

-- Você pode usar o case para classificar pedidos com base na data de pedido

select PedidoID, DataPedido,
	case
		when DataPedido < '2023-06-01' then 'Antigo'
		else 'Novo'
	end as StatusPedido
from Pedido