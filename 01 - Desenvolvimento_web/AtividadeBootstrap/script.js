let totalAdicionais = 0;
let totalEntrega = 0;
let combo = 0;
let totalFinal = 0;

function calcularTotal(){
    calcularEntrega()
    calcularAdicionais()
    // Valor do Combo
    combo = Number(document.getElementById('combo').value)
    // Soma dos valores
    let totalFinal = totalAdicionais + totalEntrega + parseFloat(combo);
    // Coloca os valores na "descrição do pedido"
    document.getElementById("floatingTextarea2Disabled").innerHTML = `Irá pagar R$${totalEntrega.toFixed(2)} pela entrega e R$${totalAdicionais.toFixed(2)} pelos adicionais e R$${combo.toFixed(2)} pelo combo.`;
    // Coloca o valor final no "total a pagar"
    document.getElementById("totalpagar").value = `R$${totalFinal.toFixed(2)} reais.`;
}

function calcularEntrega(){
    totalEntrega = 0;
    
    // "Tamanho" dos elementos da lista {XSaudável, XTudo, Outros} [0,3]
    let qtdEntrega = document.querySelectorAll("input[name='entrega']").length;
    // Variável para selecionar os 2 inputs radio de entrega
    let entrega = document.querySelectorAll("input[name='entrega']");  
    // Processo que vai verificar todos os inputs radio de acordo com o índice da lista
    for (let i=0; i < qtdEntrega; i ++)
    {
        // Se o input radio estiver checked, ele vai colocar o valor dentro de uma variável
        if (entrega[i].checked == true)
        {
            totalEntrega = parseFloat(entrega[i].value);
            break;
        }
    }
}
function calcularAdicionais(){
    totalAdicionais = 0;

    // Variável que seleciona o input checkbox
    let adicionais = document.querySelectorAll("input[name='adicionais']");
    // Processo que vai verificar todos os inputs checkbox de acordo com o índice da lista [0,4]
    for (let i=0; i < adicionais.length; i ++)
    {
        if (adicionais[i].checked == true)
        {
            totalAdicionais = totalAdicionais + parseFloat(adicionais[i].value);
        }
    }
}