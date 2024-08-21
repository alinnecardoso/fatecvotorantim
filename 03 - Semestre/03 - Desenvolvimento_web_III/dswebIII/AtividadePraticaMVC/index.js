const express = require('express');
const app = express();
const alunosRoute = require('./src/Routes/alunosRoute')

// Configura EJS como o motor de visualização
app.set('view engine', 'ejs')
app.set('views', './src/views/alunos')

// Middleware para processar dados de formulário
app.use(express.urlencoded({ extended: true }));

app.use(alunosRoute)


app.listen(3000, ()=>{
  console.log('Server is running on server http://localhost:3000/');
})