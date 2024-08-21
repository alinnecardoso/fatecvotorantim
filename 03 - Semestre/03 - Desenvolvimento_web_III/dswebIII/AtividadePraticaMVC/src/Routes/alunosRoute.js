const express = require('express');
const route = express.Router();
const alunosController = require('../controllers/alunosController')

route.get('/alunos', alunosController.getAlunos)
route.get('/alunos/getAll', alunosController.getAll)
route.get('/alunos/save', alunosController.getForms)
route.post('/alunos/save', alunosController.postAluno)

module.exports = route;