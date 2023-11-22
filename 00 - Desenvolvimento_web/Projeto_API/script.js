const bandeira = "https://flagsapi.com/"
const imgapi = "https://source.unsplash.com/1600x900/?Votorantim"


// api de clima

// pega o icone do botão
let lupa = document.getElementById("pesquisaClima");

// Adiciona um evento ao clicar na lupa
lupa.addEventListener('click', async function()
{   
    // pegar valor dentro do input cidade
    let cidade = document.getElementById("cidade").value;
    // path do api de clima
    const apiClimaURL = `https://api.openweathermap.org/data/2.5/weather?q=${cidade}&units=metric&appid=${apikey}&lang=pt_br`;
    // requisição dentro do path de api
    respostaClima = await fetch(apiClimaURL)
    // transforma a resposta que está em json em objeto no JavaScript
    let objdados = await respostaClima.json()
    // pega a "temp" dentro do objeto "objdados" e guarda na variável "temperatura"
    let temperatura = objdados.main.temp;
    // pega a descrição dentro do objeto "objdados" e guarda na variável "descrição"
    let descricao = objdados.weather[0].description;
    // substitui o valor "" do <p> e coloca a temperatura e descrição
    document.getElementById("resultado").innerHTML = `Hoje está ${temperatura}°C e ${descricao}.`
})

// api de cep

// pega o elemento no botão "pesquisa"
let elemento = document.getElementById("pesquisa")
// adiciona um evento ao clicar no botão "pesquisa"
elemento.addEventListener('click', async function()
{   
    // pega o valor dentro de <p> e colocar ""
    document.getElementById('resultado').innerText = "";
    // pega o valor dentro do input cep
    var valor= document.getElementById("cep").value;
    // se escrever nada ""
    if (valor==''){
        // aparece um alerta
        alert("Informe o CEP");
    }
    // senão
    else
    {   
        // pega o valor do cep e substitui os digitos por ''
        var cep = valor.replace(/\D/g, '');
        // confere se foi digitado 8 digitos de 0 a 9
        var validacep = /^[0-9]{8}$/;

        //  verifica se a estrutura "validacep" está dentro da variável "cep"
        if(validacep.test(cep)) {
            // path do api cep
            var api= 'https://viacep.com.br/ws/'+cep+'/json/';
            // requisição dentro do path api
            let resposta = await fetch(api);
            // transforma a resposta que está em json em objeto no Javascript
            dados = await  resposta.json();
            console.log(dados);

        // se o valor dentro da variável "dados" der erro
        if (dados.erro)
            // Coloca uma mensagem dentro do elemento de id="resultado"
            document.getElementById('resultado').innerText = "CEP Não Existe";
        else
            // coloca todas as variáveis entre crases dentro do elemento de id="resultado"
            document.getElementById('resultado').innerText = `${dados.logradouro} - ${dados.bairro}, ${dados.localidade} - ${dados.uf} `
            // pega o valor dentro do input e coloca a localidade (cidade)
            document.getElementById('cidade').value = dados.localidade
    }
        else
        //if (!(resposta.ok))
        // caso não entre em nenhum dos "if" e "else" acima, aparecerá o alerta
            alert("cep inválido");
    }
})