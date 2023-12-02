# 3011392323003

soma = 0
mult = 1
num = input("Digite um número: ")
lista = list(num)

for c in lista:
    transf_num = int(c)
    soma += transf_num
    mult *= transf_num


print(lista)
print(soma)
print(mult)