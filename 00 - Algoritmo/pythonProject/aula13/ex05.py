from math import pow, pi


def calcula_volume(r):
    v = (4 * pi * pow(r, 3)) / 3
    return v


raio = float(input("Digite o valor do raio: "))
print(f"O Volume da esfera será de: {calcula_volume(raio):.2f} m³")
