const UserModel = require('../model/user')

const userModel = new UserModel();

let users = userModel.getAll();

exports.getForms = ((req, res) =>{
  res.render("index")
})

exports.postForms = ((req, res) => {
  const { name, email } = req.body;

  newUser = {
    name: name,
    email: email,
  };

  userModel.save(newUser)

  // Responde com sucesso e o novo usuário adicionado
  res.status(200) // Corrigido para usar status
  res.redirect('/users'); // Redireciona para a página de listagem
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
