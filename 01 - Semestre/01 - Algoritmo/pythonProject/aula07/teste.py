itens = ["Abacate", "Limão", "Tangerina"]
precos = [2.13, 0.19, 1.95]
len_precos = 10
len_itens = len(itens[0])
for it in itens:
    len_itens = max(len_itens, len(it))
print("-"*(len_itens+len_precos))
print("%-*s%*s" % (len_itens, "Item", len_precos, "Preço"))
print("-"*(len_itens+len_precos))
for i in range(len(itens)):
    print("%-*s%*.2f" % (len_itens, itens[i], len_precos, precos[i]))
