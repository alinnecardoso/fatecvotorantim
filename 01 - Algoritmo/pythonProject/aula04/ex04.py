salario_inicial = float(input("Escreva o seu salário: R$"))
salario_final = salario_inicial * 1.25
aumento = salario_final - salario_inicial

print(f"Você obteve um aumento de R${aumento:0.2f} e seu salário atual será de: R${salario_final:0.2f}")
