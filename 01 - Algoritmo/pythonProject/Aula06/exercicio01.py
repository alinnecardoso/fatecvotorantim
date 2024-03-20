n = int(input("Digite um número: "))

if n % 5 == 0 and n % 3 == 0:
    print(f"O número {n} é divisível por 5 e por 3 ao mesmo tempo.")
else:
    print(f"O número {n} não é divisível por 3 e por 5 ao mesmo tempo.")
