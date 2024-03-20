def ehprimo(m):
    for i in range(2, m):
        if (m % i) == 0:
            return False
    return True

def qtd_primos(n):
    qtd = 0
    for i in range(1, n+1):
        if ehprimo(i):
            qtd += 1
    return qtd

numero = int(input("Digite um número: "))
print(f"Existem {qtd_primos(numero)} números primos entre 1 e {numero}")
