Select * from item_pedido
Select * from Setor
Select * from Funcionario
Select * from produto
select * from vendedor

select Nrmatricula, Primeiro_Nome, Ultimo_Nome,	Cod_Setor 
from Funcionario
where Cod_Setor = 2

select Primeiro_Nome, Salario 
from Funcionario
where Salario < 5500

select Primeiro_Nome, Salario 
from Funcionario
where Salario between 4500 and 7500

select cod_produto, descricao, Valor_unitario
from produto
where Valor_unitario between 0.32 and 2.00

/* Listar todos os funcionários que tenham a letra M em qualquer parte do nome */
select Primeiro_Nome, Salario, Cod_Setor
from Funcionario
where Primeiro_Nome like '%M%'

/* Listar todos os funcionários que tenham a letra M no inicio do nome */
select Primeiro_Nome, Salario, Cod_Setor
from Funcionario
where Primeiro_Nome like 'M%'

/* Listar todos os produtos que tenham a sua unidade começando por K */
select cod_produto, descricao, Unidade
from produto
where Unidade like 'K%'

select nome_vendedor, faixa_comissao
from vendedor
where faixa_comissao in ('A', 'B')

select Primeiro_Nome, Salario, Cod_Setor
from Funcionario
where Cod_Setor in	(1, 3)

/* Listar o nome, salário e setor de todos os funcionários que trabalham nos departamentos de códigos 1 e 3 */
select * from Funcionario
where Cod_Setor not in(1, 3)

select *
from cliente
where IE is not null


/* Mostrar os clientes que tenham e-mail */
select Primeiro_Nome, Salario, Cod_Setor
from Funcionario
where Email is not null

select Nrmatricula, Ultimo_Nome, Salario
from Funcionario
where Salario > 1000 and Nrmatricula >= 3

select * from Funcionario
where Salario > 2500 or Cod_Setor = 4


/* listar os produtos que tenham unidade igual a 'M' e valor unitário igual a R$1.05 */
select descricao
from produto
where Unidade = 'M' and Valor_unitario = 1.05

/* listar os produtos que tenham unidade igual a 'UN' e valor unitário igual a R$4.00 */
select descricao
from produto
where Unidade = 'UN' and Valor_unitario = 4

/* Listar em ordem alfabética a lista de vendedores e seus respectivos salparios fixos
	Ordem crescente - default*/
select nome_vendedor, salario_fixo
from vendedor
order by nome_vendedor

/* Listar em ordem alfabética a lista de funcionários por ordem de setor */
select * from Funcionario
where Cod_Setor not in (2, 4)
order by Cod_Setor

/* Listar em ordem alfabética a lista de funcionários por ordem decrescente de setor */
select * from Funcionario
where Cod_Setor not in(2, 4)
order by Cod_Setor desc

/* Listar em ordem alfabética a lista de funcionários por ordem de setor e primeiro nome */
select * from Funcionario
where Cod_Setor not in(2, 4)
order by Cod_Setor, Primeiro_Nome

create table Pessoa(
	id_pessoa integer primary key,
	nome varchar(20),
	cpf varchar(14)
)

create table Pessoa_Fisica(
	id_pessoa integer primary key,
	nome varchar(20),
	cpf varchar(14)
)

insert into Pessoa values (1, 'Pedro Cabral', '12345678991');


insert into Pessoa_Fisica
select id_pessoa, nome, cpf 
from Pessoa

select * from Pessoa
select * from Pessoa_Fisica

select Funcionario.Primeiro_Nome, Funcionario.Salario, Setor.Nome_Setor
from Funcionario, Setor

select Funcionario.Primeiro_Nome, Funcionario.Salario, Setor.Nome_Setor
from Funcionario, Setor
where Funcionario.Cod_Setor = Setor.Cod_Setor

select f.Primeiro_Nome, f.Salario, s.Nome_Setor
from Funcionario f, Setor s
where f.Cod_Setor = s.Cod_Setor