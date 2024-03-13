/* [1] */
CREATE TABLE Tbl_Clientes(
	Id_Cliente INT not null,
	Nome_Cliente VARCHAR(50) not null,
	Email_Cliente VARCHAR(100) not null,
	Telefone_Cliente VARCHAR(15) not null

CONSTRAINT PK_Clientes PRIMARY KEY(Id_Cliente)
);

/* [2] */
INSERT INTO Tbl_Clientes
VALUES
(1,'João Silva', 'joao@gmail.com', '(11) 1234-5678')

/* [3] */
INSERT INTO Tbl_Clientes
VALUES
(2,'Daniel', 'daniel@gmail.com', '(15) 1111-1111'),
(3,'Rafael', 'rafael@gmail.com', '(11) 2222-2222'),
(4,'Gabriel', 'gabriel@gmail.com', '(15) 3333-3333'),
(5,'Ana', 'ana@gmail.com', '(11) 4444-4444'),
(6,'Alinne', 'alinne@gmail.com', '(15) 5555-5555'),
(7,'Gabriela', 'gabriela@gmail.com', '(11) 6666-6666'),
(8,'Mariana', 'mariana@gmail.com', '(15) 7777-7777'),
(9,'Julia', 'julia@gmail.com', '(11) 8888-8888'),
(10,'carolina', 'carolina@gmail.com', '(15) 9999-9999');

/* [4] */
UPDATE Tbl_Clientes
SET Telefone_Cliente = '(11) 8765-4321'
WHERE Id_Cliente = 1

/* [5] */
CREATE TABLE Tbl_Produtos
(
	Id_Produto INT not null,
	Nome_Produto VARCHAR(50) not null,
	Preco_Produto DECIMAL(6,2),
	Estoque_Produto INT not null,

CONSTRAINT PK_Produtos PRIMARY KEY(Id_Produto),
);

/* [6] */
INSERT INTO Tbl_Produtos
VALUES
(1, 'Camiseta', 29.99, 100)


/* [7] */
INSERT INTO Tbl_Produtos
VALUES
(2, 'Calça', 99.99, 200),
(3, 'Camisa', 89.99, 300),
(4, 'Blusa', 79.99, 400),
(5, 'Boné', 69.99, 500),
(6, 'Tênis', 59.99, 600),
(7, 'Sapato', 49.99, 700),
(8, 'Chinelo', 39.99, 800),
(9, 'Sandália', 19.99, 900),
(10, 'Shorts', 79.99, 100);


/* [8] */
UPDATE Tbl_Produtos
SET Preco_Produto = 39.99
WHERE Id_Produto = 1

/* [9] */
CREATE TABLE Tbl_Pedidos(
	Id_Pedido INT not null,
	ClienteId INT not null,
	ProdutoId INT not null,
	Qtd_Pedido INT not null,
	Data_Pedido DATE not null,

CONSTRAINT PK_Pedido PRIMARY KEY(Id_Pedido),
CONSTRAINT FK_Clientes FOREIGN KEY(ClienteId) REFERENCES Tbl_Clientes(Id_Cliente),
CONSTRAINT FK_Produtos FOREIGN KEY(ProdutoId) REFERENCES Tbl_Produtos(Id_Produto),
);


/* [10] */
INSERT INTO Tbl_Pedidos
VALUES
(1, 1, 1, 2, '12-03-2024')

/* [11] */
UPDATE Tbl_Pedidos
SET Qtd_Pedido = 3
WHERE Id_Pedido = 1

/* [12] */
INSERT INTO Tbl_Pedidos
VALUES
(2, 2, 2, 2, '09-10-2024'),
(3, 3, 3, 2, '14-06-2024'),
(4, 4, 4, 2, '12-05-2024'),
(5, 5, 5, 2, '02-07-2024'),
(6, 6, 6, 2, '22-12-2024'),
(7, 7, 7, 2, '17-11-2024'),
(8, 8, 8, 2, '01-03-2024'),
(9, 9, 9, 2, '10-02-2024'),
(10, 10, 10, 2, '13-03-2024')

/* [13] */
CREATE TABLE Tbl_Funcionarios(
	Id_Func INT not null,
	Nome_Func VARCHAR(50) not null,
	Cargo_Func VARCHAR(50) not null,
	Salario_Func DECIMAL(6,2) not null,

CONSTRAINT PK_Funcionario PRIMARY KEY(Id_Func),
)

/* [14] */
INSERT INTO Tbl_Funcionarios
VALUES
(1, 'Maria Santos', 'Gerente', 5000.00)


/* [15] */
UPDATE Tbl_Funcionarios
SET Salario_Func = 6000.00
WHERE Id_Func = 1

/* [16] */
INSERT INTO Tbl_Funcionarios
VALUES
(2, 'Laizza', 'Desenvolvedor', 9000.00),
(3, 'Monique', 'Suporte', 5000.00),
(4, 'Geovana', 'Analista', 8000.00),
(5, 'Caroline', 'Administrativo', 2000.00),
(6, 'Elias', 'Porteiro', 2000.00),
(7, 'Sheldon', 'Segurança', 3000.00),
(8, 'Mary', 'Faxineiro', 2000.00),
(9, 'Nilson', 'CEO', 9000.00),
(10, 'Elizeu', 'Segurança', 5000.00)

/* [17] */
CREATE TABLE Tbl_Vendas(
	Id_Venda INT not null,
	ProdutoId INT not null,
	Qtd_Venda INT  not null,
	ValorTotal_Venda DECIMAL(6,2) not null,
	Data_Venda DATE not null,

CONSTRAINT PK_Venda PRIMARY KEY(Id_Venda),
CONSTRAINT FK_Produto FOREIGN KEY(ProdutoId) REFERENCES Tbl_Produtos(Id_Produto)
)

/* [18] */
INSERT INTO Tbl_Vendas
VALUES
(1, 1, 2, 79.98, '12-03-2024')


/* [19] */
INSERT INTO Tbl_Vendas
VALUES
(2, 2, 2, 99.98, '11-02-2024'),
(3, 3, 2, 89.98, '17-05-2024'),
(4, 4, 2, 79.98, '14-11-2024'),
(5, 5, 2, 69.98, '10-12-2024'),
(6, 6, 2, 59.98, '09-09-2024'),
(7, 7, 2, 49.98, '22-02-2024'),
(8, 8, 2, 39.98, '22-05-2024'),
(9, 9, 2, 29.98, '10-04-2024'),
(10, 01, 2, 19.98, '11-06-2024')


/* [20] */
DELETE FROM Tbl_Vendas
WHERE Id_Venda = 1

SELECT * FROM  Tbl_Clientes
SELECT * FROM  Tbl_Produtos
SELECT * FROM  Tbl_Pedidos
SELECT * FROM  Tbl_Funcionarios
SELECT * FROM  Tbl_Vendas


