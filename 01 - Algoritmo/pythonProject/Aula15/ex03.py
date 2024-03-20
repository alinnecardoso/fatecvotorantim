
def somaImposto(taxaImposto, custo):
    imposto = custo + (custo * (taxaImposto/100))
    return imposto


taxa = float(input("Informe o valor da taxa de imposto: "))
custo = float(input("informe o custo do item: "))
print(f"O valor do item com imposto será de: {somaImposto(taxa, custo):.2f}")