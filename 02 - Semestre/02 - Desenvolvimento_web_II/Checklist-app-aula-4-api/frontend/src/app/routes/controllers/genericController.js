const sql = require('mssql');
const dbConfig = {
    user: 'dba_sqlserver',
    password: 'pla(omp',
    server: '192.168.0.61',
    database: 'Checklist_app',
    options: {
        encrypt: false,
        enableArithAbort: true,
        trustServerCertificate: true
    }
};

// Conectar ao banco de dados uma vez
const poolPromise = new sql.ConnectionPool(dbConfig).connect().then(pool => {
    console.log('Conectado ao banco de dados SQL Server');
    return pool;
}).catch(err => console.error('Falha ao conectar ao banco de dados SQL Server', err));

const executeQuery = async (query, params = []) => {
    try {
        const pool = await poolPromise;
        const request = pool.request();

        params.forEach(param => {
            request.input(param.name, param.type, param.value);
        });

        const result = await request.query(query);
        return result;
    } catch (err) {
        throw new Error(err);
    }
};

const genericController = {
    getAll: async (req, res, tableName) => {
        try {
            const result = await executeQuery(`SELECT * FROM ${tableName}`);
            res.json(result.recordset);
        } catch (err) {
            console.error(`Erro ao obter dados de ${tableName}:`, err);
            res.status(500).send(`Erro ao obter dados de ${tableName}`);
        }
    },

    getById: async (req, res, tableName) => {
        const { id } = req.params;
        try {
            const result = await executeQuery(`SELECT * FROM ${tableName} WHERE id = @id`, [{ name: 'id', type: sql.Int, value: id }]);
            res.json(result.recordset[0]);
        } catch (err) {
            console.error(`Erro ao obter dado de ${tableName} com id ${id}:`, err);
            res.status(500).send(`Erro ao obter dado de ${tableName}`);
        }
    },

    create: async (req, res, tableName, fields) => {
        const fieldNames = fields.join(', ');
        const fieldValues = fields.map(field => `@${field}`).join(', ');
        const params = fields.map(field => ({ name: field, type: sql.NVarChar, value: req.body[field] }));

        try {
            await executeQuery(`INSERT INTO ${tableName} (${fieldNames}) VALUES (${fieldValues})`, params);
            res.status(201).send(`Registro criado em ${tableName}`);
        } catch (err) {
            console.error(`Erro ao criar registro em ${tableName}:`, err);
            res.status(500).send(`Erro ao criar registro em ${tableName}`);
        }
    },

    update: async (req, res, tableName, fields) => {
        const { id } = req.params;
        const fieldUpdates = fields.map(field => `${field} = @${field}`).join(', ');
        const params = fields.map(field => ({ name: field, type: sql.NVarChar, value: req.body[field] }));
        params.push({ name: 'id', type: sql.Int, value: id });

        try {
            await executeQuery(`UPDATE ${tableName} SET ${fieldUpdates} WHERE id = @id`, params);
            res.send(`Registro de id ${id} atualizado em ${tableName}`);
        } catch (err) {
            console.error(`Erro ao atualizar registro em ${tableName}:`, err);
            res.status(500).send(`Erro ao atualizar registro em ${tableName}`);
        }
    },

    delete: async (req, res, tableName) => {
        const { id } = req.params;
        try {
            await executeQuery(`DELETE FROM ${tableName} WHERE id = @id`, [{ name: 'id', type: sql.Int, value: id }]);
            res.send(`Registro de id ${id} deletado de ${tableName}`);
        } catch (err) {
            console.error(`Erro ao deletar registro de ${tableName} com id ${id}:`, err);
            res.status(500).send(`Erro ao deletar registro de ${tableName}`);
        }
    }
};

module.exports = genericController;