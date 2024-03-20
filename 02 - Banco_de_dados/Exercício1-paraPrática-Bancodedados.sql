CREATE DATABASE FBD;
go
use FBD;

create table cliente (
Cod_cliente int Primary Key,
Nome_cliente varchar(50) not null,
Endereco varchar (50),
Cidade varchar(20),
Cep char(8),
UF char(2),
CPF char(14),
IE char(12));

create table vendedor (
cod_vendedor int,
nome_vendedor varchar (50) not null,
faixa_comissao char(1),
salario_fixo decimal(10,2),
CONSTRAINT PK_VENDEDOR PRIMARY KEY (COD_VENDEDOR));


create table produto (
cod_produto int Primary Key,
descricao varchar(20),
Unidade char(2),
Valor_unitario decimal(10,2));


create table pedido (
Num_pedido int,
data_compra datetime,
data_entrega datetime,
cod_cliente int not null,
cod_vendedor int not null ,
FOREIGN KEY(cod_cliente) REFERENCES CLIENTE(Cod_cliente),
FOREIGN KEY(cod_vendedor) REFERENCES VENDEDOR(Cod_vendedor),
PRIMARY KEY(Num_pedido)
);


create table item_pedido (
num_pedido int references pedido,
cod_produto int references produto,
quantidade int,
primary key(num_pedido, cod_produto) )

create table Cidade(
	Codcidade int identity(1, 1) not null primary key,
	Nomecidade varchar(40),
	cdestado varchar(2)
);

create table Empregado(
	Nrmatriculo int identity(1,1) primary key,
	Nome varchar(50),
	Data_admissao datetime,
	Salario float
);

insert into Cidade (Nomecidade, cdestado)
values
('Sorocaba', 'SP'),
('Araçoiaba', 'SP'),
('Itu', 'SP'),
('Tatuí', 'SP'),
('Votorantim', 'SP')

select * from Cidade

insert into Empregado(Nome, Data_admissao, Salario)
values
('José Junior', '23-04-2020', 5000.00),
('Elias da Silva', '12-01-2020', 100.00),
('Ana Livia', '03-11-2020', 20000.00),
('Rebeca Antunes', '19-05-2020', 3000.00),
('Rute Correa', '01-10-2020', 2000.00)

select distinct cdestado from Cidade

select distinct unidade from produto

select cdestado, nomecidade from cidade

select 'Código do Cliente', Cod_cliente, 'Nome do Cliente', Nome_cliente
from cliente

select Cod_cliente as 'Código do Cliente', Nome_cliente as 'Nome do Cliente'
from cliente

select nome, Salario, Salario*1.50 aumento_salario
from Empregado

select 'Funcionario: ' + ' - '  + Nome + ' - ' + 'Salário: ' + CONVERT(varchar, Salario) as 'Concatenado', salario, Nome
from empregado

select num_pedido, cod_produto, quantidade
from item_pedido
where quantidade = 120

/* [1] [3] */
Create table Setor(
	Cod_Setor int identity(1,1),
	Nome_Setor varchar(30)

Constraint PK_Setor primary key(Cod_Setor)
)
/* [2] [3]*/
Create table Funcionario(
	Nrmatricula int identity(1,1),
	Primeiro_Nome varchar(20),
	Ultimo_Nome varchar(50),
	Email varchar (200),
	Telefone varchar(20),
	Data_Admissao datetime,
	Salario float,

	Cod_Setor int

constraint PK_Funcionario primary key(Nrmatricula),
constraint FK_Setor foreign key(Cod_Setor) references Setor(Cod_Setor)
)

/* [4] */
insert into Setor(Nome_Setor)
values
('RH'), ('Marketing'), ('Vendas'), ('Recebimento'), ('Expedição')

select * from Setor


/* [5] */
insert into Funcionario (Primeiro_Nome, Ultimo_Nome, Email, Telefone, Data_Admissao, Salario,Cod_Setor)
values
('Maria', 'José', 'maria@gmail.com', '(15)11111-1111', '11-11-2011', 2900.00, 1),
('Isaías', 'Saad', 'isaias@gmail.com', '(15)22222-2222', '10-10-2010', 3500.00, 2),
('Elizeu', 'Rodrigues', 'elizeu@gmail.com', '(15)33333-3333', '09-09-2009', 4200.00, 3),
('Lúcia', 'Tomazi', 'lucia@gmail.com', '(15)44444-4444', '08-08-2008', 6900.00, 4),
('Fabiana', 'Rodrigues', 'fabiana@gmail.com', '(15)55555-5555', '07-07-2007', 7100.00, 5),
('Pedro', 'Henrique', 'pedro@gmail.com', '(15)66666-6666', '06-06-2006', 9300.00, 1)

select * from Funcionario


/* [6] - a */
select distinct Cod_Setor from Funcionario

/* [6] - b */
select Ultimo_Nome + ', '  + CONVERT(varchar, Cod_Setor) as 'Empregador e Setor', Ultimo_Nome, Cod_Setor
from Funcionario




