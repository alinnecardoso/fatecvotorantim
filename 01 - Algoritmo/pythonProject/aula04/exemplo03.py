# from math import pow, sqrt
x1 = int(input("Entre com x1: "))
y1 = int(input("Entre com y1: "))
x2 = int(input("Entre com x2: "))
y2 = int(input("Entre com y2: "))

dx = x2 - x1
dy = y2 - y1

d = ((dx ** 2) + (dy ** 2)) ** (1/2)

# d = sqrt(pow(dx, 2) + (pow(dy, 2)))

print("A distancia entre os pontos é de: {}".format(d))
