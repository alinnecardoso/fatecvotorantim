def negativoPositivo(num):
    if num > 0:
        return "P"
    else:
        return "N"

n = int(input("Digite um número: "))
print(negativoPositivo(n))
