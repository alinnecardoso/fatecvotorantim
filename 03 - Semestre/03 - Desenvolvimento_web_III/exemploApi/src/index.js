const express = require('express');
const app = express();
const port = 3000;

app.use(express.json())

let nomes = [];

app.get('/', (req, res) => {
    res.json(nomes);
})

app.post('/', (req, res) =>{
    let nome = req.body.name
    nomes.push(nome)
    res.send(`Nome: ${req.body.name}`)
})

app.post('/exercicio', (req, res) => {
    const {temperatura} = req.body;
    const {tipo} = (req.body).toUpperCase();
    const newTemp = converte(tipo, temperatura);
    res.json(newTemp);
})

function converte(tipo, temperatura){
    switch (tipo) {
        case "C":
            return resultado = (9*temperatura/5) + 32;
        case "F":
            return resultado = 5 *(temperatura - 32)/9;
        default:
            return resultado = 0;
    }
    
}

app.post('/exercicio02', (req, res) =>{
    let {nota} = req.body
    let {qtdAlunos} = req.body
    const calcularNota =  calcularNota(nota, qtdAlunos)
    res.json(calcularNota)
})

function calcularNota(nota, qtdAlunos){
    let lista = [];
    lista.push(nota);
    
    console.log(lista)
}

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`);
})