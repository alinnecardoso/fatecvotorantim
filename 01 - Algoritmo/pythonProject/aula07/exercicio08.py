n = int(input("Digite um número inteiro: "))
num_divisivel = 0
primo = True

for i in range(1, n+1):
    if n % i == 0:
        num_divisivel = num_divisivel + 1

if num_divisivel > 2:
    primo = False
if primo:
    print(f"É um número primo")
else:
    print("Não é um número primo")

'''if n_primo:
    print("Não é primo")
    #não é um número primo
else:
    print("É primo")
    #é um número primo'''