#Definição de Funções
def linha(qtd=20):
    for i in range(0, qtd):
        print("-", end='')
    print()

linha()
print("** usando funções **")
linha(30)
