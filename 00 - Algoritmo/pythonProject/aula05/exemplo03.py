dia = int(input("Entre com o número do dia: "))
if dia == 1:
    nome = "Domingo"
elif dia == 2:
    nome = "Segunda-Feira"
elif dia == 3:
    nome = "Terça-Feira"
elif dia == 4:
    nome = "Quarta-Feira"
elif dia == 5:
    nome = "Quinta-Feira"
elif dia == 6:
    nome = "Sexta-Feira"
elif dia == 7:
    nome = "Sábado"
else:
    nome = f"O valor {dia} é inválido!"

print(nome)
