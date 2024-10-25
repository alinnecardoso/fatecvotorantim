import express from 'express';
import cors from 'cors';
import contasRoutes from './routes/contas.js'


const app = express();

const port = 3001;

app.use(cors()); //Habilita qualquer cliente acessar
app.use(express.json()); //Define que usaremos JSON

app.use('/contas', contasRoutes);

app.listen(port, () => {
    console.log(`🚀 Servidor rodando na porta ${port}`);
})
