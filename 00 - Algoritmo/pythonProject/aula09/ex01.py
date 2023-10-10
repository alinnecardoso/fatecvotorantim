lista = []

for i in range(1, 11):
    lista.append(int(input(f"Digite o número {i}: ")))

'''lista.reverse()
print(lista)'''

for i in lista[::-1]:
    print(i, end=' ')
print()
print(lista)
