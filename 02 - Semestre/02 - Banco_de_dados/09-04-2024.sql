select getdate()

select DATENAME(yy, getdate())

select datename(month, getdate())

select DATEPART(mm, getdate())

select DATEPART(month, getdate())

select DAY(getdate())

select MONTH(GETDATE())

select YEAR(getdate())

/* Retorna a diferença entre duas datas */

select DATEDIFF(ww, '14-08-2004', getdate() + 366)

select DATEDIFF(yy, getdate(), getdate() + 720)

/* Adiciona 1 ano */
select DATEADD(yy, 1, getdate())


/* Mostra 3 meses depois do atual */
select DATENAME(month,(dateadd(month, 3,getdate())))

select ISDATE('27-02-2023')

select ISDATE('30-02-2023')

select convert(char, getdate(), 103)

select convert(char, getdate(), 113)

select round(123.3467, 3)
select round(123.3467, 2)
select round(123.3467, 1)
select round(123.3467, 1)
select round(123.3467, 0)
select round(123.3467, -1)
select round(123.3467, -2)

/* Retorna o maior inteiro menor ou igual à expressão numérica especificada */
select floor(123.45)

/* Calcula a potência de um número */
select POWER(4, 2)
select POWER(2, 2)

/* Retorna o código ASCII do caractere mais à esquerda de uma expressão de caractere */
select ASCII(''), ASCII('Amanda')

/* Converte um código de ASCII int em um caractere */
select CHAR(65), CHAR(66)

select CHARINDEX('Mundo', 'Ola Mundo Bonito')
select CHARINDEX('Mundo', 'Ola Mundo Bonito', 3)
select CHARINDEX('Mundo', 'Ola Mundo Bonito', 6)

select REPLACE('abcdefghicde', 'cde', 'xxx')

select REPLACE(Primeiro_Nome, 'C', 'z') from Funcionario

select STUFF('abcdef', 2, 3, '_ijklmn_')

select LEFT('abcdefgh', 5)

select right('abcdefgh', 5)

select REPLICATE('ABC', 3)

select SUBSTRING('ABCDEFGHIJ', 2,3)

select LEN('ABCD')
select LEN('ABCD  . ')

select REVERSE('NATAN')

select LOWER('AbCD')

select LOWER(Primeiro_Nome) from Funcionario

select '_' + LTRIM(' AbCD    ') + '_'

select '_' + RTRIM('     AbCD ') + '_'

