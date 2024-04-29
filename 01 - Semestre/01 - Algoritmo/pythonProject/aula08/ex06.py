palavra = input('Digite uma palavra: ').lower()

contrario = palavra[::-1] #palavra ao contrario

if palavra == contrario:
    print(f'A palavra {palavra.upper()} é um palíndromo!!')
else:
    print(f'A palavra {palavra.upper()} não é um palíndromo')