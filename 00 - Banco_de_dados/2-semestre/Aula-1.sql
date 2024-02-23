/* COMENTÁRIO */
Create table Cliente
(
Cod_Cli int not null,
Nome_Cli varchar(40) not null,
End_Cli varchar(30) not null,
Bai_Cli varchar(20) not null,
Cid_Cli varchar(20) not null,
Uf_Cli char(3) not null,
Tel_Cli varchar(15) null,
Constraint PK_Cliente Primary Key(Cod_Cli)
)

Create Table NotaFiscal
(
Num_Nota int not null,
Cod_Cli int not null,
Serie_Nota varchar(10) not null,
Emissao_Nota smalldatetime null,
Vtot_Nota SmallMoney not null,
Constraint PK_NotaFiscal Primary Key(Num_Nota),
Constraint FK_Cliente Foreign Key(Cod_Cli) References cliente(Cod_Cli)
)

Create table Cidade
(
Codcidade varchar(2) not null,
Nomecidade varchar(40)
)

Create table Empregado
(
Nrmatricula int,
Nome varchar(50),
Data_demissao datetime,
Salario float
)

Create table estado
(
cdestado varchar(2) not null,
Nomeestado varchar(30)
)

Alter table cidade
Add primary key(codcidade);

Alter table cidade
Add cdestado char(2) not null,
teste varchar(1) null;

Alter table cidade
Drop column teste;

Alter table cidade
Alter column cdestado varchar(2);

Alter table cidade
Drop constraint PK__Cidade__9ED2CA9603BB2F9A;

Alter table cidade
Add Constraint PK_codcidade Primary Key(codcidade);


Alter table estado
Add Constraint PK_cdestado primary key (cdestado);

Alter table cidade
Add Constraint FK_cdestado Foreign key(cdestado) references estado(cdestado);

Drop table Empregado