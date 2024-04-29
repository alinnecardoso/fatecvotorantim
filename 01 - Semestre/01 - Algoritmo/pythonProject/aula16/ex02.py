y = 3
entrada = y * 2 + 5
soma = 0
def num_primo(entrada):
    qtd = 0
    for i in range(1, entrada + 1):
        if entrada % i == 0:
            qtd = qtd + 1
            #print(qtd_primo)
    if qtd > 2: #se for divisivel por mais de 2 num, então não é primo.
        return False
    return True



def qtd_primo(entrada):
    lista_num_primo = []
    for c in range(0, entrada + 1):
        if num_primo(c):
            lista_num_primo.append(c)
    return len(lista_num_primo)


lista_primo = []
for c in range(0, entrada + 1):
    if num_primo(c):
        lista_primo.append(c)
for c in lista_primo:
    soma += c


print(f'''Verifica se é primo: {num_primo(entrada)}
Verifica a quantidade de números primos: {qtd_primo(entrada)}
Lista de número primo (RA): {lista_primo}
A soma será: {soma}''')