n = int(input("Digite um valor inteiro: "))
e = 0
for i in range(1, n+1):
    e = e + (2**i)
print(e)
