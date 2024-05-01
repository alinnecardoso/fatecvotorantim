select NomeProduto, Preco
from Produto
where Preco < 100
union all
select NomeProduto, Preco
from Produto
where Preco > 1000;

/* suponha que queremos encontrar todas as categorias que têm produtos com preços superiores a 1000 e
que também têm produtos pedidos. Podemos usar INTERSECT para fazer isso:*/
select NomeCategoria, CategoriaID
from Categoria
where CategoriaID in (select CategoriaID from Produto where Preco > 1000)
intersect
select NomeCategoria, CategoriaID
from Categoria
where CategoriaID in (select Produto.CategoriaID from Produto join Pedido on
Produto.ProdutoID = Pedido.ProdutoID);

/* Suponha que agora queremos encontrar todas as categorias que têm produtos com preços superiores a 100, mas
não têm produtos pedidos. Podemos usar EXCEPT para isso:*/
select NomeCategoria
from Categoria
where CategoriaID in(select CategoriaID from Produto where Preco > 100)
except
select NomeCategoria
from Categoria
where CategoriaID in(select Produto.CategoriaID from Produto join Pedido on
produto.ProdutoID = pedido.ProdutoID);

/* Transact-SQL permite a construção de blocos SQL para acesso e maipulação das bases de dos. Estes blocos
podem estar estruturados de duas formas:
1. Dentro de um arquivo de texto na forma de um lote;
2. Declarado na forma de uma sub-rotina de banco de dados.*/

/* Introdução - View*/
/*  Pode ser considerada uma "tabela virtual" , os dados são armazenados no cache do SGBD*/

/* Suponha que você deseje criar uma view que mostre todso os produtos com preços superiore a
1000. A conulta para criar essa view seria assim: */

create view ProdutosCars as
select NomeProduto, Preco
from Produto
where Preco > 1000;

create view ProdutosMaisCarosPorCategoria as
select Categoria.NomeCategoria, Produto.NomeProduto, Produto.Preco
from Categoria
inner join Produto on Categoria.CategoriaID = Produto.CategoriaID
where Produto.Preco = (select max(Preco) from produto as P
						where p.CategoriaID = Categoria.CategoriaID);

select * from ProdutosMaisCarosPorCategoria;