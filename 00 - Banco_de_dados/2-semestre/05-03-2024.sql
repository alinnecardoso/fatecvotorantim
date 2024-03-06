/* [1] */
CREATE TABLE Professores(
Id_Professor INT not null,
Nome_Professor VARCHAR(50) not null,
Disciplina VARCHAR(15) not null,

CONSTRAINT PK_Professor PRIMARY KEY(Id_Professor)
);

/* [2] */
INSERT INTO Professores
VALUES (1, 'Ana Oliveira', 'Português');

/* [3] */
UPDATE Professores
SET Nome_Professor = 'Ana Silva'
WHERE Id_Professor = 1

/* [4] */
INSERT INTO Professores
VALUES (10, 'Bia Souza', 'Física');

/* [5] */
DELETE FROM Professores
WHERE Id_Professor = 2



/* [6] */
CREATE TABLE Turmas(
Id_Turma INT not null,
ProfessorResponsavel INT not null,
Nome_Turma VARCHAR(50) not null

CONSTRAINT PK_Turmas PRIMARY KEY(Id_Turma)
CONSTRAINT FK_Professores FOREIGN KEY(ProfessorResponsavel) References Professores(Id_Professor)
)

/* [7] */
INSERT INTO Turmas (Id_Turma, ProfessorResponsavel, Nome_Turma)
VALUES (1, 1, '9A')

/* [8] */
INSERT INTO Turmas
VALUES (10, 1, '5B');

/* [9] */
CREATE TABLE Alunos(
Id_Aluno INT not null,
TurmaId INT not null,
Nome_Aluno VARCHAR(50) not null,
Data_Nascimento DATE not null,

CONSTRAINT PK_Alunos PRIMARY KEY(Id_Aluno),
CONSTRAINT FK_Turmas FOREIGN KEY(TurmaId) References Turmas(Id_Turma)
)


/* [10] */
INSERT INTO Alunos
VALUES (1, 1, 'Maria Souza', '2005-10-15');

/* [11] */
UPDATE Alunos
SET Nome_Aluno = 'Maria da Silva'
WHERE Id_Aluno = 1

/* [12] */
INSERT INTO Alunos
VALUES (10, 10, 'Pedro Henrique', '2005-09-24');

/* [13] */
DELETE FROM Alunos
WHERE Id_Aluno = 2

/* [14] */
CREATE TABLE Notas(
Id_Nota INT not null,
AlunoId INT not null,
Disciplina VARCHAR(15) not null,
Nota DECIMAL(5,2) not null,

CONSTRAINT PK_Notas PRIMARY KEY(Id_Nota),
CONSTRAINT FK_Alunos FOREIGN KEY(AlunoId) References Alunos(Id_Aluno)
)

/* [15] */
INSERT INTO Notas
VALUES ();

Select * from Notas