frase = input('Escreva uma frase: ').lower()
qtd = 0
for letra in frase:
    if letra in 'aeiou':
        qtd = qtd + 1

print(f'Existem {len(frase)} caracteres e {qtd} vogais')