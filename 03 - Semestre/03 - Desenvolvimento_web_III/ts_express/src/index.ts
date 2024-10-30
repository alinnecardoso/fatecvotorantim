import express from 'express';
const app = express();
import userRoutes from './routes/user';

app.use("/api/v1", userRoutes)


app.listen(3000, () => {
    console.info("Servidor rodando na porta 3000");
})
