-- Atualizar pre�o
-- Se der errado, desfaz todas as altera��es para manter a consistencia dos dados

begin transaction

-- Aumenta os pre�os de todos os produtos em 10%
select * from Produto
update Produto
set Preco= Preco*1.1;

--Confirma a transa��o
commit;
select * from Produto


-- Inserir categoria e produtos ao mesmo tempo
-- Ambas ser�o tratadas comu uma �nica unidade

begin transaction

-- Insere novas categorias
select * from Categoria
insert into Categoria(CategoriaID, NomeCategoria)
values (11, 'Decora��o'),
(12, 'Autom�veis');

-- Insere novos produtos nas novas categorias
select * from Produto
insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
values(11, 'Vaso Decorativo', 11, 30),
(12, 'Pneu de Carro', 12, 100);

-- Confirma a transa��o
commit;
select * from Categoria
select * from Produto

-- Inser��o de Dados incorretos

begin transaction

-- Inserindo dados incorretos
select * from Produto
insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
values(11, 'Produto Errado', 100, 9999);
select * from Produto
-- Detectou um erro, ent�o desfaz as opera��es
rollback;

begin transaction;

-- Atualiza��o com erro
update Produto set CategoriaID = 100 where ProdutoID = 3;

-- Detectou um erro, ent�o desfaz as opera��es
rollback;

begin transaction;

-- Atualiza��o com erro
update Produto set CategoriaID = 100 where ProdutoID = 3;
if @@ERROR = 0
commit
else
rollback; -- detectou um erro, ent�o desfaz as opera��es
print 'Atualiza��o na Tabela Produto foi Cancelada'

-- categoriza��o de Pre�os de Produtos

-- Usar case para categorizar produtos com base em seus pre�os.

select NomeProduto, Preco,
	case
		when Preco < 100 then 'Barato'
		when Preco >= 100 and Preco < 1000 then 'M�dio'
		else 'Caro'
	end as CategoriaPreco
from Produto

-- definir Desconto com base na categoria

-- Aplicar descontos a produtos com base em suas categorias

select NomeProduto, CategoriaID, Preco,
	case CategoriaID
		when 1 then Preco * 0.9 -- Categoria Eletr�nicos(10% de desconto)
		when 2 then Preco * 0.95 -- Categoria Roupas (5% de desconto)
		else Preco
	end as PrecoComDesconto
from Produto

-- Convers�o de Valores de Categoria

-- Converter valores de categoria em nomes mais legiveis

select ProdutoID, CategoriaID,
	case CategoriaID
		when 1 then 'Eletr�nicos'
		when 2 then 'Roupas'
		when 3 then 'Alimentos'
		else 'Desconhecida'
	end as NomeCategoria
from Produto;

-- Classifica��o Condicional de Pedidos

-- Voc� pode usar o case para classificar pedidos com base na data de pedido

select PedidoID, DataPedido,
	case
		when DataPedido < '2023-06-01' then 'Antigo'
		else 'Novo'
	end as StatusPedido
from Pedido