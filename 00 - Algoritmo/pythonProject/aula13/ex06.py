def calculo_segundos(h, m, s):
    return h * 3600 + m * + s


hora = int(input("Digite a hora:"))
minuto = int(input("Digite o minuto:"))
segundo = int(input("Digite o segundo:"))

print(f"Corresponde a {calculo_segundos(hora, minuto, segundo)} segundos!")
