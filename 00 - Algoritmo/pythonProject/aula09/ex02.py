lista = []

for i in range(1,6):
    lista.append(int(input(f"Digite o número {i}: ")))

maior = max(lista)
posicao = lista.index(maior)

print(f"O maior valor será de {maior} e será {posicao + 1}º posição.")