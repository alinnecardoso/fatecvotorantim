CREATE TABLE PeriodicElement(
ADD id INT IDENTITY(1,1) PRIMARY KEY,
position INT  NOT NULL DEFAULT (0), 
name CHAR(50)  NOT NULL  DEFAULT (' '), 
weight FLOAT  NOT NULL  DEFAULT (0) , 
symbol CHAR(10)  NOT NULL  DEFAULT (' ') )
GO 

insert into PeriodicElement (
position,  name,  weight, symbol
)
values
(1, 'Hydrogen', 1.0079, 'H') 
go 

insert into PeriodicElement (
position,  name,  weight, symbol
)
values
(2,  'Helium', 4.0026,  'He') 
go 

insert into PeriodicElement (
position,  name,  weight, symbol
)
values
(3,  'Lithium',  6.941,  'Li') 
go 

insert into PeriodicElement (
position,  name,  weight, symbol
)
values
( 4, 'Beryllium',  9.0122, 'Be') 
go 

insert into PeriodicElement (
position,  name,  weight, symbol
)
values
(6, 'Carbon', 12.0107, 'C') 
go 

insert into PeriodicElement (
position,  name,  weight, symbol
)
values
(7, 'Nitrogen',  14.0067,  'N') 
go 

insert into PeriodicElement (
position,  name,  weight, symbol
)
values
( 8, 'Oxygen', 15.9994, 'O') 
go 

insert into PeriodicElement (
position,  name,  weight, symbol
)
values
( 9, 'Fluorine', 18.9984, 'F') 
go 

insert into PeriodicElement (
position,  name,  weight, symbol
)
values
( 10, 'Neon', 20.1797, 'Ne') 
go 
 
