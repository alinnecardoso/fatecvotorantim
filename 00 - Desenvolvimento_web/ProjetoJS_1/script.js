function calcularNovoSalario(){
    //obtendo os valores dos inputs
    let salario = parseFloat(document.querySelector("#salario").value);
    let percentual = parseFloat(document. querySelector("#percentual").value);
    //calculando o novo salário
    novoSal = salario + (percentual/100) * salario;
    // Pegando o Elemento 'p' e substituindo pelo valor do novo salário
    document.getElementById("novosalario").innerHTML = `Seu novo salário será de: R$${novoSal.toFixed(2)}`;
}

function calcularAreaTriangulo(){
    // obtendo os valores dos inputs
    let base = parseFloat(document.querySelector("#base").value);
    let altura = parseFloat(document.querySelector("#altura").value);
    // calculando a área do triângulo
    area = 0.5 * base * altura;
    // Pegando o Elemento 'Caixa de Texto" e substituindo pela área do trângulo
    document.getElementById("areatriangulo").value = `A área do Triângulo é ${area.toFixed(2)}m³`;
}

function calcularMediaPonderada(){
    // obter os valores dos inputs
    let nota1 = parseFloat(document.querySelector("#nota1").value);
    let nota2 = parseFloat(document.querySelector("#nota2").value);
    //calcular a média ponderada
    media = (nota1 * 0.3) + (nota2 * 0.7);
    // Pegando o Elemento 'Label' e substituindo pela média ponderada
    document.getElementById("mediaponderada").innerHTML = `A média ponderada será: ${media.toFixed(2)}`;
}

function calcularData(){
    // Pegar o valor do input 'data de nascimento'
    let nascimento = parseFloat(document.querySelector("#nascimento").value);
    // Calcular anos
    anos = 2023 - nascimento;
    // calcular meses
    meses = anos * 12;
    // Calcular semanas
    semanas = anos * 52;
    // Calcular dias
    dias = anos * 365;
    // Calcular horas
    horas = anos * 8760;
    // Calcular minutos
    minutos = anos * 525600;
    // Quantos anos terá em 2050
    idadefuturo = 2050 - nascimento;

    console.log(`Sua idade em:
Anos: ${anos};
Meses: ${meses};
Semanas: ${semanas};
Dias: ${dias};
Horas: ${horas};
Minutos: ${minutos};
E em 2050 você terá ${idadefuturo} anos.`);
}

function calcularConsumoMedio(){
    // Pegar o valor da distância
    let distancia = parseFloat(document.querySelector("#distancia").value);
    // Pegar o valor do volume gasto em combustivel
    let volume = parseFloat(document.querySelector("#volume").value);
    // Calcular consumo médio
    
    consumomedio = distancia / volume;
    // Pegando elemento 'Caixa de Texto' e substituindo pelo Consumo Médio
    document.getElementById("consumomedio").value = `Consumo Médio: ${consumomedio.toFixed(2)}Km/L`;
}
function calcularTudo(){
    // Pegar o valor do salário mês
    let salario =  parseFloat(document.querySelector("#salario2").value);
    // Pegar as horas trabalhadas na semana
    let horasSem = parseFloat(document.querySelector("#horas").value);

        
    if (horasSem > 40){
        // Horas trabalhadas no dia
        horasDia = parseFloat(horasSem / 5);
        // Horas Trabalhadas no Mês
        horasMes = parseFloat(horasSem * 5);

        // Salário por hora
        salHora = salario / horasMes;
        // Salário por dia
        salDia = salHora * 8;
        // Salário semana
        salSem = salDia * 5;
        // Salário mês
        salMes = salSem * 5;


        // Valor Liquido (com Desconto da refeição no dia)
        Desc_Dia = salDia - 1.5;
        // Valor Liquido (com Desconto da refeição na semana)
        Desc_Sem = salSem - (1.5 * 5);
        // Valor Liquido (com Desconto da refeição no mês)
        Desc_mes = salMes - (1.5 * 25);
        

        // Quantas horas a mais
        horasExtra = horasSem - 40;
        // Horas por mês
        horasMes = horasSem * 5;
        // Salário por hora normal
        salHora = (salario / horasMes);

        // Salário por hora extra vezes 3
        salHora3 = (salario / horasMes) * 3;
        // Valor a ser acrescentado no salário por horas extras
        valorHoraExtra = salHora3 * horasExtra;
        // Salário Bruto
        bruto = salario + valorHoraExtra

        // Quantidade total descontada no Mês
        Desc_Refeicao = bruto - Desc_Sem;

        // // Salário por hora
        // salDia = salHora3 * 8;
        // // Valor Liquido (com Desconto da refeição no dia)
        // Desc_Dia = salDia - 1.5;
        // // Valor Liquido (com Desconto da refeição na semana)
        // Desc_Sem = Desc_Dia * 5;
        // // Valor Liquido (com Desconto da refeição no mês)
        // Desc_mes = Desc_Sem * 5;
        // // Quantidade total descontada no Mês
        // Desc_Refeicao = bruto - Desc_mes;


//     alert(`Valor total de horas extras: R$${valorHoraExtra.toFixed(2)}
//     Horas Extras: ${horasExtra}
// Salário dia: R$${salDia.toFixed(2)}
// dia com desconto: R$${Desc_Dia.toFixed(2)}
// Salario Semana: R$${salSem.toFixed(2)}
// semana com desconto: R$${Desc_Sem.toFixed(2)}
// Salario mês: R$${salMes}
// mês com desconto: R$${Desc_mes.toFixed(2)}`);

    document.getElementById("calcularTudo").value = `Salário Bruto: R$${(bruto).toFixed(2)}
    Desconto: R$${(1.5 * 25).toFixed(2)}
    Salário Liquído: R$${(bruto - (1.5 * 25)).toFixed(2)}`;
    }
    else if (horasSem < 40){
        alert("Carga horária miníma não atingida")
    }
    else{

        // Horas trabalhadas no dia
        horasDia = parseFloat(horasSem / 5);
        // Horas Trabalhadas no Mês
        horasMes = parseFloat(horasSem * 5);

        // Salário por hora
        salHora = salario / horasMes;
        // Salário por dia
        salDia = salHora * 8;
        // Valor Liquido (com Desconto da refeição no dia)
        Desc_Dia = salDia - 1.5;
        // Valor Liquido (com Desconto da refeição na semana)
        Desc_Sem = Desc_Dia * 5;
        // Valor Liquido (com Desconto da refeição no mês)
        Desc_mes = Desc_Sem * 5;
        // Quantidade total descontada no Mês
        Desc_Refeicao = salario - Desc_mes


        document.getElementById("calcularTudo").value = `Salário Bruto: R$${salario.toFixed(2)}
    Desconto: R$${Desc_Refeicao.toFixed(2)}
    Salário Liquído: R$${Desc_mes.toFixed(2)}`;
    }
}

function calculoHoraExtra(){
    horasExtra = horasSem - 40;
    horasMes = horasSem * 5;
    horasDia = horasSem / 5;
    salHora = (salario / horasMes) * 3;
    valorHoraExtra = 3 * horasExtra;
}

//     document.getElementById("calcularTudo").value = `Salário Bruto: R$${salarioBrutoMes.toFixed(2)}
// Desconto: R$${Desc_Refeicao.toFixed(2)}
// Salário Líquido: R$${Desc_mes.toFixed(2)}`;


