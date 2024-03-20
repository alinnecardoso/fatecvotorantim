x = float(input("Lado x:"))
y = float(input("Lado y: "))
z = float(input("Lado z: "))

if x + y > z and x + z > y and z + y > x:
    if x == y == z:
        print("É um triângulo equilátero")
    elif x != y != z:
        print("É um triângulo escaleno")
    elif (x == y != z) or (x == z != y) or (y == z != x):
        print("É um trângulo isósceles")
else:
    print("Não pode ser um triângulo")
