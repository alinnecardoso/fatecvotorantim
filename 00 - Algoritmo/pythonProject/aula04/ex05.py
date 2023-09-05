salario_inicial = float(input("Salário atual: R$"))
percentual = float(input("Percentual de aumento(%): "))
salario_final = salario_inicial + (salario_inicial * percentual)/100
aumento = salario_final - salario_inicial

print(f"você obteve o aumento de R${aumento} e seu novo salário será de R${salario_final}")
