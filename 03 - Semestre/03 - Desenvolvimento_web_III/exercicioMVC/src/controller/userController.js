const UserModel = require('../model/user')

const userModel = new UserModel();

let users = userModel.getAll();

exports.getForms = ((req, res) =>{
  res.redirect("/users")
  res.render("index")
})


exports.postForms = ((req, res) => {
  const { name, email } = req.body;

  const newUser = {
    name: name,
    email: email,
  };

  // Adiciona o novo usuário ao array users
  users.save(newUser);

  // Responde com sucesso e o novo usuário adicionado
  res.status(200) // Corrigido para usar status
  res.redirect('/users'); // Redireciona para a página de listagem
});

exports.listUsers = ((req, res) => {
  res.render("index", { users: users });
})
