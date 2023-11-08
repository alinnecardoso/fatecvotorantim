let totalAdicionais = 0;
let totalEntrega = 0;
let combo = 0;

function calcularTotal(){
    calcularEntrega()
    calcularAdicionais()
    combo = Number(document.getElementById('combo').value)
    let totalFinal = totalAdicionais + totalEntrega + parseFloat(combo);
    document.getElementById("totalpagar").innerHTML = `Total a pagar: R$${totalFinal}`;
    document.getElementById("floatingTextarea2Disabled").innerHTML = `Irá pagar ${totalEntrega} pela entrega e ${totalAdicionais} pelos adicionais.`;
}

function calcularEntrega(){
    totalEntrega = 0;
    let qtdEntrega = document.querySelectorAll("input[name='entrega']").length;

    let entrega = document.querySelectorAll("input[name='entrega']");  
    for (let i=0; i < qtdEntrega; i = i + 1)
    {
        if (entrega[i].checked == true)
        {
            totalEntrega = parseFloat(entrega[i].value);
            break;
        }
    }
    //(`Total Entrega: ${totalEntrega}`);
}
function calcularAdicionais(){
    totalAdicionais = 0;
    let adicionais = document.querySelectorAll("input[name='adicionais']");
    for (let i=0; i < adicionais.length; i = i + 1)
    {
        if (adicionais[i].checked == true)
        {
            totalAdicionais = totalAdicionais + parseFloat(adicionais[i].value);
        }
    }
    // alert(`Adicionais: ${totalAdicionais}`);
}