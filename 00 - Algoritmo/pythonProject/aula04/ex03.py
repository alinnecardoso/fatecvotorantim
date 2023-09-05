ano_nascimento = int(input("Ano de nascimento: "))
ano_atual = int(input("Ano atual: "))

idade = ano_atual - ano_nascimento
meses = 12 * idade
dias = 365 * idade
semanas = 53 * idade

print('''Essa pessoa tem:
{} anos
{} meses
{} semanas
{} dias'''.format(idade, meses, semanas, dias))
