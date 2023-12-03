def soma(valor1, valor2, valor3):
    return valor1 + valor2 + valor3


print("=== Digite 3 números ===")
n1 = int(input(f"Digite um número: "))
n2 = int(input(f"Digite um número: "))
n3 = int(input(f"Digite um número: "))

print(f"A soma dos valores será: {soma(n1, n2, n3)}")
