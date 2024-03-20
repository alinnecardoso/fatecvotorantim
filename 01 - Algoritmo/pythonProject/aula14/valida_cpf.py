def valida_cpf():
    soma1 = soma2 = 0
    cpf = input("Digite seu CPF no formato (xxx.xxx.xxx-xx): ")

    cpf_semponto = cpf.replace(".", "").replace("-", "")
    while len(cpf_semponto) != 11:
        print("CPF inválido")
        break

    cpf_list = list(cpf_semponto)
    cpf_nove = len(cpf_list[0:10])
    cpf_dez = len(cpf_list[0:11])

    # Validação primeiro digito
    for j, i in enumerate(cpf_list[0:9]):
        mult = int(cpf_nove - j) * int(i)
        soma1 += mult
        #print(f"{cpf_nove - j} * {i} = {mult} ||| {soma1}")
    resto = soma1 % 11
    print(f"Resto: {resto}")

    if resto < 2:
        cpf_list[9] = 0
    else:
        cpf_list[9] = 11 - resto
    print(f"Digito 1: {cpf_list[9]}")

    # Validação segundo digito
    for j, i in enumerate(cpf_list[0:10]):
        mult = int(cpf_dez - j) * int(i)
        soma2 += mult
        #print(f"{cpf_dez - j} * {i} = {mult} ||| {soma2}")
    resto = soma2 % 11
    print(f"Resto: {resto}")

    if resto < 2:
        cpf_list[10] = 0
    else:
        cpf_list[10] = 11 - resto
    print(f"Digito 2: {cpf_list[10]}")

    for k in cpf_semponto:
        if not k.isdigit():



print(valida_cpf())

# 507.027.108-30