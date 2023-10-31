d = {}
soma_idade = 0
for i in range(4):
    i += 1
    nome = input(f'Digite o {i}º nome: ')
    idade = int(input(f'Digite a {i}ª idade: '))
    soma_idade += idade
    d[nome] = idade

media = soma_idade / i
maior_nome = ' '
maior_idade = 0
print(media)

print('Os nomes maiores que a média são: ')
for chave, valor in d.items():
    if valor > media:
        maior_idade = valor
        maior_nome = chave
        print(maior_nome)
