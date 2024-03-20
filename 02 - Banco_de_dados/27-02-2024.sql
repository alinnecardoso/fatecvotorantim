insert into estado
values
('SP', 'São Paulo');

insert into estado
values
('MG', 'Minas Gerais');

insert into cidade
values
('1', 'Votorantim', 'SP');

insert into cidade (Codcidade, Nomecidade, cdestado)
values
('2', 'Sorocaba', 'SP');

insert into cidade(Codcidade, Nomecidade, cdestado)
values ('3', 'Itu', 'NN');

Insert into cidade(Codcidade, Nomecidade, cdestado)
Values('4', 'Itapira', 'NN');

Insert into cidade(Codcidade, Nomecidade, cdestado)
Values('5', 'Belo Horizonte', 'MG');


Select * from estado;

Select * from cidade;



insert into estado
values
('NN', 'Não Cadastrado');

update Cidade
set cdestado = 'SP'
where cdestado = 'NN'

select * from cidade
where cdestado = 'MG'



update Cidade /* Update - Atualiza */
set cdestado = 'NN' /* adiciona o valor 'NN' na coluna cdestado */
where Nomecidade in ('Itu', 'Itapira')/* apenas altera 2 cidades na coluna Nomecidade */


delete from Cidade /* Delete remove a linha toda */
where Nomecidade = 'Itapira'

create table Tbl_clientes(
	codigo INT identity(1,1) primary key,
	nome VARCHAR(100),
	UF VARCHAR(2)
);

select * from Tbl_clientes;

Insert into Tbl_clientes
	(nome, UF)
values
	('Nicholas', 'RS');

Insert into Tbl_clientes
	(nome, UF)
values
	('Alinne', 'SP'),('Rafael', 'SC'), ('Matheus', 'AC');

Select Ident_Current('Tbl_Clientes');
/* OU */
select Ident_Current('Tbl_Clientes') as Ultimo_registro;