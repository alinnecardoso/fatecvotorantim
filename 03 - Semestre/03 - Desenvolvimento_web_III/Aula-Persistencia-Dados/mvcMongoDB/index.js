const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const userRoute = require('./src/routes/userRoute');
const mongoose = require('mongoose');

let url = 'mongodb://localhost:27017/Fatec';
let mongodb = process.env.MONGO_URI || url;
mongoose.connect(mongodb);
mongoose.Promise = global.Promise;
let db = mongoose.connection; //tratar erro
db.on('error', console.error.bind(console, 'Erro ao conectar com a base de dados')); // Se der erro, mostra no console

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));

app.use(userRoute)

app.listen(3000, () =>{
    console.log('Servidor rodando na porta 3000');
})
