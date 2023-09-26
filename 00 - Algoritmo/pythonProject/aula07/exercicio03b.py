while True:
    base = float(input("Entre com a base: "))
    if base > 0:
        break
    print("O valor digitado é inválido...")

while True:
    altura = float(input("Entre com a altura: "))
    if altura > 0:
        break
    print("O valor digitado é inválido...")
area = (base * altura) / 2
print(f"A área do triângulo é {area:5.2f}")
