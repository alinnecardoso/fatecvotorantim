'''n = input('Digite nove caracteres numéricos: ')

print(f'{n[0:1]}.{n[1:4]}.{n[4:7]},{n[7:10]}')'''

while True:
    n = input('Digite os número: ')
    if n.isnumeric() and len(n) == 9:
        break
    if n.isnumeric():
        print('Tem que ter 9 digitos!!!')
    else:
        print('Digite apenas números!!!')

print(f'{n[0:1]}.{n[1:4]}.{n[4:7]},{n[7:10]}')