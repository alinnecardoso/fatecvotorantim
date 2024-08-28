const express = require('express');
const app = express();

const userRoute = require('./src/routes/userRoute')

// Middleware para interpretar corpos de solicitações urlencoded
app.use(express.urlencoded({ extended: true }));

// Middleware para interpretar corpos de solicitações JSON (se necessário)
app.use(express.json());

//importa a rota
app.use(userRoute)

//configura o ejs
app.set('view engine', 'ejs')
app.set('views', './src/view/')

//inicia servidor
app.listen(3000, (req,res) =>{
  console.log('Servidor rodando na porta 3000')
})