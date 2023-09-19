valor = float(input("Digite o valor da sua compra: R$"))
desconto1 = valor - valor*0.10
desconto2 = valor - valor*0.20
desconto3 = valor - valor*0.30

if valor <= 1000:
    print(f"Você terá um desconto de 10%, e pagará {desconto1:0.2f}")
elif 1000 < valor < 5000:
    print(f"Você terá um desconto de 20%, e pagará {desconto2:0.2f}")
else:
    print(f"Você terá um desconto de 30%, e pagará {desconto3:0.2f}")
