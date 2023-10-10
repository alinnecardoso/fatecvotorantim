from random import randint

lista = [0] * 7

for _ in range(6000):
    n = randint(1, 6)
    lista[n] = lista[n] + 1

p = [0] * 7

for i in range(1, 7):
    p[i] = int((lista[i] / 6000) * 100)
    print(f"{i} - {p[i]:.2f}% - {lista[i]}")


'''
for i in range(0, 6000):
    lado = lista.append(randint(1, 6))
f1 = lista.count(1)
f2 = lista.count(2)
f3 = lista.count(3)
f4 = lista.count(4)
f5 = lista.count(5)
f6 = lista.count(6)

Frequência de {f1}
Frequência de {f2}
Frequência de {f3}
Frequência {f4}
Frequência {f5}
Frequência {f6}

print(f1 + f2 + f3 + f4 + f5 + f6)'''