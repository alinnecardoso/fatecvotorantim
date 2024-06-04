const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const elementRoutes = require('./routes/element');
//const carrosRoutes = require('./routes/carros');
//const motoristasRoutes = require('./routes/motoristas');

// Inicializar Express
const app = express();
const port = 3000;

app.use(bodyParser.json());
app.use(cors());

// Usar rotas
app.use('/api/element', elementRoutes);

//app.use('/api/carros', carrosRoutes);
//app.use('/api/motoristas', motoristasRoutes);

app.listen(port, () => {
    console.log(`Servidor está rodando na porta ${port}`);
});