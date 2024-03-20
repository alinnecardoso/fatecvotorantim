def ehpar(n):
    if (n % 2) == 0:
        return True
    else:
        return False


m = int(input("Digite um número: "))
if ehpar(m):
    print("O número é par! ")
else:
    print("O número é impar! ")
