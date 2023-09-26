soma_peso = 0
soma_altura = 0
maior_imc = 0
menor_imc = 0
for i in range(1, 3):

    peso = float(input(f"[{i}] Digite o valor do seu peso: "))
    altura = float(input(f"[{i}] Digite o valor da sua altura(m): "))
    soma_peso = soma_peso + peso
    soma_altura = soma_altura + altura
    imc = peso / (altura**2)

    if imc == 0:
        maior_imc = imc
        menor_imc = imc

    if imc > maior_imc:
        maior_imc = imc

    if imc < menor_imc:
        menor_imc = imc

peso_medio = soma_peso / 2
altura_media = soma_altura / 2

print(imc)

print(f'''A média do peso será de: {peso_medio:5.2f} Kg
A média da altrua será de: {altura_media:5.2f} metros
O menor IMC será de: {menor_imc:5.2f}
O maior IMC será de: {maior_imc:5.2f}''')

