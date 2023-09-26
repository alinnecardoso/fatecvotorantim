soma = 0
media = 0
q_idade = int(input("Digite a quantidade de idades que você deseja fazer a média: "))
quantidade = q_idade + 1
for i in range(1, quantidade):
    n = int(input(f"Digite o {i}ª idade: "))
    soma = soma + n
media = soma / q_idade
print(f"A média das idades é {media:5.2f}")
