const UserModel = require('../model/user')

const userModel = new UserModel();

let users = userModel.getAll();

exports.getForms = ((req, res) =>{
  const message = {}; 
  res.render("index",{ message })
})

exports.postForms = ((req, res) => {
  const { name, email } = req.body;

  newUser = {
    name: name,
    email: email,
  };


  // Verifica se o email já existe
  const existingUser = users.find((user) => user.email === email);

  if (existingUser) {
    // Exibe mensagem de erro e interrompe a execução
    return res.render('index', {
      message: { type: 'danger', text: 'Esse email já existe' }
    });
  }

  // Salva o novo usuário se o email não existir
  userModel.save(newUser);

  // Exibe mensagem de sucesso
  res.render('index', {
    message: { type: 'success', text: 'Usuário cadastrado com sucesso!' }
  });
});


exports.listUsers = ((req, res) => {
  res.render("adm", { users });
})

exports.deleteUserByEmail = ((req, res) =>{
  const { email } = req.params;

  for(i=0; i<users.length; i++){
    if(users[i].email === email){
      users = userModel.delete(email)
      res.redirect('/users')
      res.status(200).json({deleted : true})
      return;
    }
  }
  
  res.redirect('/users')
  res.status(400).json({error : 'User not found'})
})

exports.countUsers = ((req, res) =>{
  const count = users.length;
  res.status(200).json({count})
})
