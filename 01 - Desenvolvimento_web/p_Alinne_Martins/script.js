addEventListener('click', async function obterCidade(){
    var cep = document.getElementById("cep").value;
    var api = `https://viacep.com.br/ws/${cep}/json/`;

    let dado = await fetch(api);

    let obj = await json(dado);

    // console.log(obj)
    
    // document.getElementById("resposta") = `${obj.cep}`;
    
})

function soma(){
    let idade = parseFloat(document.getElementById("idade").value);
     
    var soma = idade + 30;
    alert(`A soma será: ${soma}`)
}

function cadastrar(){
    var radio = document.querySelectorAll.value;

    if(value="sim"){
        alert("Cadastrado com sucesso!")
    }
}
