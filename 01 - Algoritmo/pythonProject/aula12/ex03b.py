i = 0
lista1 = []
conjunto1 = []
lista2 = []
conjunto2 = []
print('CONJUNTO 1')
for i in range(5):
    i += 1
    elemento1 = input(f'Digite o {i}º elemento: ')
    lista1.append(elemento1)
    conjunto1 = set(lista1)
print(' ')
print('CONJUNTO 2')
for i in range(5):
    i += 1
    elemento2 = input(f'Digite o {i}º elemento: ')
    lista2.append(elemento2)
    conjunto2 = set(lista2)

print(f'''
O Conjunto União entre as duas listas será:

{conjunto1.union(conjunto2)}''')
