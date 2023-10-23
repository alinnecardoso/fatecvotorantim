i = 0
tupla = ()
lista =[]
while i < 10:
    i += 1
    n = int(input(f"Escreva o {i}º número: "))
    lista.append(n)
lista_reverse = lista[::-1]
print(tuple(lista_reverse))
