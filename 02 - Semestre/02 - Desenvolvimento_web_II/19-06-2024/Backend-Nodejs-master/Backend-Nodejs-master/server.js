const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const sql = require('mssql');

// Configurações do SQL Server
const dbConfig = {
    user: 'dba_sqlserver',
    password: 'pla(omp',
    server: '192.168.0.61',
    database: 'Checklist_app',
    options: {
        encrypt: false, // Desabilita criptografia
        enableArithAbort: true,
        trustServerCertificate: true // Pode ser útil se o problema estiver relacionado ao certificado SSL
    }
};

// Inicializar Express
const app = express();
const port = 3000;

app.use(bodyParser.json());
app.use(cors());

// Rota de Teste de Conexão
app.get('/api/test-connection', async (req, res) => {
    try {
        // Conectar ao banco de dados
        await sql.connect(dbConfig);

        // Executar uma consulta simples
        const result = await sql.query`SELECT 1 AS test`;

        // Enviar a resposta
        res.json({
            message: 'Conexão bem-sucedida!',
            result: result.recordset
        });
    } catch (err) {
        console.error('Erro ao conectar ao banco de dados:', err);
        res.status(500).send('Erro ao conectar ao banco de dados');
    }
});

// Rota para obter dados do SQL Server
app.get('/api/PeriodicElement', async (req, res) => {
    try {
        // Conectar ao banco de dados
        await sql.connect(dbConfig);

        // Executar uma consulta
        const result = await sql.query`SELECT id, position, name, weight, symbol FROM PeriodicElement`;
        
        res.json(result.recordset);
    } catch (err) {
        console.error(err);
        res.status(500).send('Erro no servidor');
    }
});

// Rota para Inserir um Usuário
app.post('/api/PeriodicElement', async (req, res) => {
    const {id, position,  name,  weight, symbol } = req.body;

    try {
        // Conectar ao banco de dados
        await sql.connect(dbConfig);

        // Executar a consulta de inserção
        const result = await sql.query`INSERT INTO PeriodicElement (position,  name,  weight, symbol) 
                         VALUES (${position},  ${name},  ${weight}, ${symbol})`;

        // Enviar a resposta
        res.json({
            message: 'Usuário inserido com sucesso!',
            result: result
        });
    } catch (err) {
        console.error('Erro ao inserir usuário:', err);
        res.status(500).send('Erro ao inserir usuário');
    }
});

// Rota para Atualizar um Usuário
app.put('/api/PeriodicElement/:id', async (req, res) => {
    const { id } = req.params;
    const { position,  name,  weight, symbol } = req.body;

    try {
        // Conectar ao banco de dados
        await sql.connect(dbConfig);

        // Executar a consulta de atualização
        const result = await sql.query`UPDATE PeriodicElement 
          SET position = ${position},  name = ${name}, weight= ${weight}, symbol = ${symbol}  
          WHERE id = ${id}`;

        // Enviar a resposta
        res.json({
            message: 'Usuário atualizado com sucesso!',
            result: result
        });
    } catch (err) {
        console.error('Erro ao atualizar usuário:', err);
        res.status(500).send('Erro ao atualizar usuário');
    }
});

// Rota para Deletar um Usuário
app.delete('/api/PeriodicElement/:id', async (req, res) => {
    const { id } = req.params;

    try {
        // Conectar ao banco de dados
        await sql.connect(dbConfig);

        // Executar a consulta de deleção
        const result = await sql.query`DELETE FROM PeriodicElement WHERE id = ${id}`;

        // Enviar a resposta
        res.json({
            message: 'Usuário deletado com sucesso!',
            result: result
        });
    } catch (err) {
        console.error('Erro ao deletar usuário:', err);
        res.status(500).send('Erro ao deletar usuário');
    }
});

// Iniciar o servidor
app.listen(port, () => {
    console.log(`Servidor está rodando na porta ${port}`);
});