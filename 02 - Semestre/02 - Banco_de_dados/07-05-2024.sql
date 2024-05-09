/* Declaração de variável
DECLARE
Para atribuir um valor à variável definidade e utiliza-se o comando SET ou o comando SELECT
*/

/* Declarar uma varável chamada @MinPreco para armazenar o preço mínimo de produtos em uma categoria especifíca.
A variável será definida usando o comando SET e depois usada em uma consulta.*/

declare @MinPreco decimal(10,2); /*Declaração da variável */
set @MinPreco = 50; /* Definição do valor da variável */

/* Consulta usando a variável */
select NomeProduto, Preco, @MinPreco
from Produto
where Preco >= @MinPreco;

/* Declarar uma variável chamada @TotalPedidos para armazenar o número total de pedidos em nossa tabela
de pedidos em nossa tabela de pedidos.
A variável será definida usando o comando select com uma consulta que calcula o total de pedidos.*/

declare @TotalPedidos int; /* Declaração da variável */

/* Definição do valor da variávelusando select */

select @TotalPedidos = count(*)
from Pedido;

-- Exibindo o valor da variável
print 'O total de pedidos é: ' + cast(@TotalPedidos as nvarchar(10));

-- Declarar uma variável chamda @MediaPreco para calcular a média de preços de produtos em um categoria
-- especifíca e, em seguida usá-la em uma consulta.

declare @MediaPreco decimal(10,2); -- Declaração variável

set @MediaPreco =(
	select AVG(Preco)
	from Produto
	where CategoriaID = 1
);

--Exibindo o valor da variável
print 'A média de preço na categoria de Eletrônicos é: ' + cast(@MediaPreco as nvarchar(10));

-- Declarar uma variável chamada @ProdutoMaisCaro para armazenar o nome do produto mais caro
-- na tabela de produtos

declare @ProdutoMaisCaro nvarchar(50); -- Declaração da variável

-- definição do valor da varável usando select

select top 1 @ProdutoMaisCaro = NomeProduto
from Produto
order by Preco desc;

-- Exibindo o valor da variável
print 'O produto mais caro é: ' + @ProdutoMaiscaro;

-- Comando TOP no Microsoft SQL Server é usado para limitar o número de linhas que uma consulta retorna.
-- Ele permite que você especifique quantas primeiras linhas (ou resultados) de uma consulta você deseja ver
-- Isso é útil quando você deseja extrair apenas um subconjunto dos resultados de uma consulta grande.

-- Suponha que você tenha uma tabela chamada "Produtos" com muitos registros e deseja
-- ver apenas os 10 produtos mais caros. Você pode usar o comando TOP da seguinte maneira:

select top 10 NomeProduto, Preco
from Produto
order by Preco desc;