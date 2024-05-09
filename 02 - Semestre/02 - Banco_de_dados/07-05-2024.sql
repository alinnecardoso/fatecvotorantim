/* Declara��o de vari�vel
DECLARE
Para atribuir um valor � vari�vel definidade e utiliza-se o comando SET ou o comando SELECT
*/

/* Declarar uma var�vel chamada @MinPreco para armazenar o pre�o m�nimo de produtos em uma categoria especif�ca.
A vari�vel ser� definida usando o comando SET e depois usada em uma consulta.*/

declare @MinPreco decimal(10,2); /*Declara��o da vari�vel */
set @MinPreco = 50; /* Defini��o do valor da vari�vel */

/* Consulta usando a vari�vel */
select NomeProduto, Preco, @MinPreco
from Produto
where Preco >= @MinPreco;

/* Declarar uma vari�vel chamada @TotalPedidos para armazenar o n�mero total de pedidos em nossa tabela
de pedidos em nossa tabela de pedidos.
A vari�vel ser� definida usando o comando select com uma consulta que calcula o total de pedidos.*/

declare @TotalPedidos int; /* Declara��o da vari�vel */

/* Defini��o do valor da vari�velusando select */

select @TotalPedidos = count(*)
from Pedido;

-- Exibindo o valor da vari�vel
print 'O total de pedidos �: ' + cast(@TotalPedidos as nvarchar(10));

-- Declarar uma vari�vel chamda @MediaPreco para calcular a m�dia de pre�os de produtos em um categoria
-- especif�ca e, em seguida us�-la em uma consulta.

declare @MediaPreco decimal(10,2); -- Declara��o vari�vel

set @MediaPreco =(
	select AVG(Preco)
	from Produto
	where CategoriaID = 1
);

--Exibindo o valor da vari�vel
print 'A m�dia de pre�o na categoria de Eletr�nicos �: ' + cast(@MediaPreco as nvarchar(10));

-- Declarar uma vari�vel chamada @ProdutoMaisCaro para armazenar o nome do produto mais caro
-- na tabela de produtos

declare @ProdutoMaisCaro nvarchar(50); -- Declara��o da vari�vel

-- defini��o do valor da var�vel usando select

select top 1 @ProdutoMaisCaro = NomeProduto
from Produto
order by Preco desc;

-- Exibindo o valor da vari�vel
print 'O produto mais caro �: ' + @ProdutoMaiscaro;

-- Comando TOP no Microsoft SQL Server � usado para limitar o n�mero de linhas que uma consulta retorna.
-- Ele permite que voc� especifique quantas primeiras linhas (ou resultados) de uma consulta voc� deseja ver
-- Isso � �til quando voc� deseja extrair apenas um subconjunto dos resultados de uma consulta grande.

-- Suponha que voc� tenha uma tabela chamada "Produtos" com muitos registros e deseja
-- ver apenas os 10 produtos mais caros. Voc� pode usar o comando TOP da seguinte maneira:

select top 10 NomeProduto, Preco
from Produto
order by Preco desc;