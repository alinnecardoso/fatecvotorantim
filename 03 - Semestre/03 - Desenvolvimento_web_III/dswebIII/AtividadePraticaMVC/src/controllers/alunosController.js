const alunos = require('../models/alunosModel')

exports.getAlunos = ((req, res)=>{
  res.send('Alunos Works!')
})
exports.getAll = ((req, res)=>{
  console.log('Tipo de alunos:', Array.isArray(alunos)); // Deve imprimir: true
  console.log('Dados de alunos:', alunos); // Deve mostrar a array de alunos
  
  res.render('listarAlunos', { alunos: alunos });
})

exports.getForms = ((req, res)=>{
  res.render('formAlunos');
})

exports.postAluno = (req, res) => {
  console.log(req.body);
  const { nome } = req.body;
  let { idade } = req.body;
  idade = parseInt(idade);

  if (!nome || !idade) {
    return res.status(400).send('Nome e idade são obrigatórios.');
  }

  const novoAluno = { nome, idade };
  alunos.push(novoAluno);

  console.log(`Lista de alunos: ${JSON.stringify(alunos)}`);
  console.log(`Aluno Novo: ${JSON.stringify(novoAluno)}`);

  res.send('Aluno adicionado com sucesso!');
};

