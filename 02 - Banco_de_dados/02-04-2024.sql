/* trás o que há de comum entre as duas tabelas */

select f.Primeiro_Nome, f.Salario, s.Nome_Setor, f.Cod_Setor, s.Cod_Setor
from Funcionario f
inner join Setor s on f.Cod_Setor = s.Cod_Setor

select c.Nome_cliente, p.Num_pedido, c.Cod_cliente, p.cod_cliente
from cliente c
inner join pedido p on c.Cod_cliente = p.cod_cliente

/* trás tudo de comum no lado "esquerdo" - se não tiver o valor no lado "direito", retorna o valor nulo */
select c.Nome_cliente, p.Num_pedido, c.Cod_cliente, p.cod_cliente
from cliente c
left outer join pedido p on c.Cod_cliente = p.cod_cliente

/* Só os que tem em A, mas não tem em B - retorna o valor null */
select c.Nome_cliente, p.Num_pedido, c.Cod_cliente, p.cod_cliente
from cliente c
left outer join pedido p on c.Cod_cliente = p.cod_cliente
where p.cod_cliente is null

/* vai trazer tudo o que tem em B, mesmo que não esteja em A*/
select f.Primeiro_Nome, f.Salario, s.Nome_Setor, f.Cod_Setor, s.Cod_Setor
from Funcionario f
right outer join Setor s on f.Cod_Setor = s.Cod_Setor

insert into Setor (Nome_Setor) values ('Limpeza')

select f.Primeiro_Nome, f.Salario, s.Nome_Setor, f.Cod_Setor, s.Cod_Setor
from Funcionario f
right outer join Setor s on f.Cod_Setor = s.Cod_Setor

select f.Primeiro_Nome, f.Salario, s.Nome_Setor, f.Cod_Setor, s.Cod_Setor
from Funcionario f
right outer join Setor s on f.Cod_Setor = s.Cod_Setor
where f.Cod_Setor is null

/* retorna todos os dados de ambas tabelas */
select c.Nome_cliente, p.Num_pedido, c.Cod_cliente, p.cod_cliente
from cliente c
full outer join pedido p on c.Cod_cliente = p.cod_cliente

select f.Primeiro_Nome, f.Salario, s.Nome_Setor, f.Cod_Setor, s.Cod_Setor
from Funcionario f
full outer join Setor s on f.Cod_Setor = s.Cod_Setor


select f.Primeiro_Nome, f.Salario, s.Nome_Setor
from Funcionario f
cross join Setor s
order by f.Primeiro_Nome

select c.Nome_cliente, p.Num_pedido
from cliente c
cross join pedido p
order by c.Nome_cliente

select min(salario_fixo) as 'MENOR SALARIO', max(salario_fixo) as 'MAIOR SALARIO'
from vendedor

select sum(quantidade)
from item_pedido
where cod_produto = 3

select avg(salario_fixo) as MEDIA_SALARIO
from vendedor

select count(*) from vendedor
where salario_fixo > 2500

select num_pedido, total_produtos = count(*)
from item_pedido
group by num_pedido

select num_pedido , total_produtos = count(*)
from item_pedido
where quantidade > 5
group by num_pedido
having count(*) > 1

update produto
set Valor_unitario = 4.00
where descricao = 'alface'

update produto
set Valor_unitario = Valor_unitario * 1.025
where Valor_unitario <
(select avg(Valor_unitario)
from produto
where unidade = 'KG')

select * from produto

/* 
média: avg
mínimo: min
máximo: max
total: sum
contar: count*/

select * from Funcionario