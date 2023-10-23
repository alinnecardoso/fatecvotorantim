i = 0
lista = {}
dic = {}

while i < 10:
    i += 1
    idade = int(input(f"Digite a {i}º idade: "))
    if idade >= 18:
        sobrenome = input(f"Escreva o {i}º sobrenome: ")
        lista.update({sobrenome: idade})
        dic = dict(lista.items())
    else:
        print("Menor de 18 anos!")
        continue
print(f'''O(s) sobrenome(s) do(s) maior(es) de idade é(são): ''')
for chave, valor in dic.items():
    maior = ({chave})
    maior_str = str(maior)
    str_sem_chaves = maior_str.replace('{','').replace('}', '')

    print(str_sem_chaves)
