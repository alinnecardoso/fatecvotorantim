largura = float(input("Digite a largura do aposento (m): "))
comprimento = float(input("Digite o comprimento do aposento (m):"))
tinta = (input('''[1] - Lata - 18 litros
[2] - Galão - 3.6 litros
[3] - Litro - 1 litro
Digite o número do tipo de medida de tinta que você deseja: '''))

altura = 2.8
porta = 1.68
aposento = 2 * (altura * comprimento) + 2 * (altura * largura) - porta
quantidade_tinta = aposento/3 #quantidade_tinta está em Litros

print(f"O aposento terá {aposento:0.2f}m² de área para pintura")

if tinta == "1":
    print(f'''Será necessário {quantidade_tinta:0.2f} Litros;
A quantidade de latas de tinta necessária para pintar o aposento será de: {quantidade_tinta//18} latas.''')

elif tinta =="2":
    print(f'''Será necessário {quantidade_tinta:0.2f} Litros;
A quantidade de galão necessária para pintar o aposento será de: {quantidade_tinta//3.6} galões.''')

else:
    print(f"A quantidade em litros necessária será de: {quantidade_tinta:0.1f} litros.")
