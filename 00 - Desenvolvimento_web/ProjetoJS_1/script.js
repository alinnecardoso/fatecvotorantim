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

function calcularTudo(){    // 1 mês = 200h de trabalho - 1 semana = 40h de trabalho
    
    // Pegar o valor do salário mês
    let salario =  parseFloat(document.querySelector("#salario2").value);
    // Pegar as horas trabalhadas na semana
    let horassemana = parseFloat(document.querySelector("#horas").value);
    // Horas trabalhadas no mês
    horasmes = parseFloat(horassemana * 5);
    // Horas trabalhada por dia
    horasdia = parseFloat(horassemana / 5);
    // Salario semana
    semsalario = (parseFloat(salario) / 5).toFixed(2);
    // Salario dia
    diasalario = (parseFloat(semsalario) / 5).toExponential(2);
    // Salario hora
    let salHora = diasalario / horasdia;
    

   
    alert(`Salario: ${salario}
Horas no mês: ${horasmes}
Horas na semana: ${horassemana}
Horas no dia: ${horasdia}`);
    
}