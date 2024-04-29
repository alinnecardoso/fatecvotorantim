def ehprimo(n):
    for i in range(2, n):
        if (n % i) == 0:
            return False
    return True
valor = int(input("Digite um número: "))
if ehprimo(valor):
    print("É primo!")
else:
    print("Não é primo!")
