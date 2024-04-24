CREATE DATABASE SUBCONSULTA;
go
use SUBCONSULTA;

-- Cria��o das tabelas
CREATE TABLE Categoria (
    CategoriaID INT PRIMARY KEY,
    NomeCategoria NVARCHAR(50)
);

CREATE TABLE Produto (
    ProdutoID INT PRIMARY KEY,
    NomeProduto NVARCHAR(50),
    CategoriaID INT,
	Preco decimal(10,2),
    FOREIGN KEY (CategoriaID) REFERENCES Categoria(CategoriaID)
);

CREATE TABLE Pedido (
    PedidoID INT PRIMARY KEY,
    DataPedido DATE,
    ProdutoID INT,
    FOREIGN KEY (ProdutoID) REFERENCES Produto(ProdutoID)
);

-- Inser��o de dados nas tabelas
INSERT INTO Categoria (CategoriaID, NomeCategoria)
VALUES
    (1, 'Eletr�nicos'),
    (2, 'Roupas'),
    (3, 'Alimentos');

INSERT INTO Produto (ProdutoID, NomeProduto, CategoriaID, Preco)
VALUES
    (1, 'Smartphone', 1, 4000),
    (2, 'Camiseta', 2, 50);


INSERT INTO Pedido (PedidoID, DataPedido, ProdutoID)
VALUES
    (1, '2023-01-15', 1),
    (2, '2023-02-20', 2);
  
-- Tabela Categoria
INSERT INTO Categoria (CategoriaID, NomeCategoria)
VALUES
    (4, 'M�veis'),
    (5, 'Livros'),
    (6, 'Jogos'),
    (7, 'Cosm�ticos'),
    (8, 'Informatica'),
    (9, 'Esportes'),
    (10, 'Brinquedos');

-- Tabela Produto
INSERT INTO Produto (ProdutoID, NomeProduto, CategoriaID, Preco)
VALUES
    (3, 'Sof�', 4, 2000),
    (4, 'Livro de Romance', 5, 40),
    (5, 'Xbox', 6, 2500),
    (6, 'Perfume', 7, 80),
    (7, 'Laptop', 8, 7000),
    (8, 'Bola de Futebol', 9, 20),
    (9, 'Quebra-Cabe�a', 10, 120),
    (10, 'Chap�u', 2, 200);

-- Tabela Pedido
INSERT INTO Pedido (PedidoID, DataPedido, ProdutoID)
VALUES
    (3, '2023-03-10', 5),
    (4, '2023-04-05', 2),
    (5, '2023-05-12', 7),
    (6, '2023-06-25', 1),
    (7, '2023-07-03', 10),
    (8, '2023-08-18', 3),
    (9, '2023-09-09', 8),
    (10, '2023-10-22', 4);

select NomeProduto from Produto
where Preco > all (select preco from Produto where NomeProduto = 'Chap�u')

select NomeProduto
from Produto
where Preco > all(select Preco from Produto
					where CategoriaID = (select CategoriaID from Categoria
											where NomeCategoria = 'Eletr�nicos'));

select NomeProduto, Preco
from Produto
where Preco < any (select Preco from Produto where CategoriaID = 1);

select NomeProduto, Preco
from Produto
where Preco < some (select Preco from Produto where CategoriaID = 1);

select NomeProduto
from Produto
where exists (select * from Pedido
				where Pedido.ProdutoID = Produto.ProdutoID);

select NomeProduto
from Produto
where ProdutoID in (select ProdutoID from Pedido where PedidoID in(1,3));


/* Listar os nome dos produtos que pertencem a categoria de eletr�nicos */
select NomeProduto
from Produto
where CategoriaID = (select CategoriaId from categoria where NomeCategoria = 'Eletr�nicos');

/* Listar os nomes dos produtos comprados em pedidos realizados em janeiro de 2023: */
select NomeProduto
from Produto
where ProdutoID in (select ProdutoID from Pedido
where year(DataPedido) = 2023 and MONTH(DataPedido) = 1);

/* Listar os nomes das categorias que possuem produtos com pre�os acima de 100 reais */
select NomeCategoria
from Categoria
where CategoriaID in (select CategoriaID from Produto where Preco > 100);

/* Listar os nomes de produtos que ainda n�o foram pedidos */
select NomeProduto
from Produto
where ProdutoID not in (select ProdutoID from Pedido);

