n = 1
ni = 0
sp = 0
print("O valor de finalização será o número [0]")
for i in range(1, 100):
    if n != 0:
        n = int(input(f"Digite o {i}º número par: "))
        if n % 2 == 0:
            sp = n + sp
        elif n % 2 != 0:
            ni = ni + 1
            continue
    elif n == 0:
        print("Finalizou o programa")
        break

elementos = i - 2
media = sp / (elementos - ni)

print(f"A média aritmética dos números pares fornecidos será de: {media:0.2f}")
