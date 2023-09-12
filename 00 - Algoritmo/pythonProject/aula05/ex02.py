n1 = float(input("Dgite a primeira nota: "))
n2 = float(input("Dgite a segunda nota: "))
n3 = float(input("Dgite a terceira nota: "))
media = (n1 + n2 + n3)/3
nota_exame = 0

if media < 3:
    resultado = "Reprovado!"
else:
    if media < 7:
        resultado = "Exame!"
        nota_exame = 12 - media
    else:
        resultado = "Aprovado!"

print(f"Média {media:5.2f} - {resultado}")
if nota_exame != 0:
    print(f"tem que tirar no mínimo {nota_exame:5.2f}")

'''if 0 <= media < 3:
    print("REPROVADO!")
elif 3 <= media < 7:
    print("EXAME!")
    nota_exame = float(input("Digite a sua nota do exame: "))
    media_exame = (nota_exame + media)/2
    print(f"Sua média foi de: {media_exame}")
    if 0 <= media < 7:
        print("REPROVADO!")
    elif media >= 7:
        print("APROVADO!")
else:
    print("APROVADO!")'''