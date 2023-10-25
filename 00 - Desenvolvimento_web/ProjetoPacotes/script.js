let valorPacote = 0;
let totalAdicionais;


function calcularTotalViagem()
{
    calcularPacote();
    calcularAdicionais();
    let totalFinal = totalAdicionais + valorPacote;
    console.log(`Valor final: ${totalFinal}`);
    // nome= document.getElementById('nome').value
    // document.getElementById("mensagem").innerHTML = (`${nome} irá pagar ${valorPacote} pelo pacote e ${totalAdicionais} pelos adicionais `);
}

function calcularAdicionais()
{
    let totalAdicionais = 0;

    let qtdAdicionais = document.querySelectorAll("input[class='adicionais']").length;

    let valorAdicionais = document.querySelectorAll("input[class='adicionais']");

    for(var i=0; i<qtdAdicionais; i++)
    {
        if (valorAdicionais[i].checked == true)
        {
            //console.log(valorAdicionais[i].value);
            totalAdicionais = totalAdicionais +  parseFloat(valorAdicionais[i].value);
        }
    }
    console.log(`Valor total de adicionais:${totalAdicionais}`)
}

function calcularPacote()
{   
    let qtdPacotes = document.querySelectorAll("input[name= 'pacotes']").length;

    let pacotes = document.querySelectorAll("input[name='pacotes']");

    //let valor = document.querySelectorAll("input[name= 'pacotes']:checked").value;

     //           i< pacotes.length
    for (var i=0; i< qtdPacotes; i++)
    {
        if ( pacotes[i].checked )
        {   //console.log(pacotes[i].value);
            valorPacote = parseFloat(pacotes[i].value);
            console.log(`Valor do Pacote:${valorPacote}`);
            break;
        }
    }
    
}