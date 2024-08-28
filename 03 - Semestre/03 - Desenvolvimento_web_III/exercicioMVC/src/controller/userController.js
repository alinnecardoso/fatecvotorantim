const userModel = require('../model/user')

exports.getForms = ((req, res) =>{
  res.redirect("/users")
  res.render("index")
})

// Supondo que `users` esteja definido e seja um array
let users = [
  { 
    name: 'John Doe',
    email: 'john@example.com'
  },
]; // Definição inicial de users como um array

exports.postForms = ((req, res) => {
  const { name, email } = req.body;

  const newUser = {
    name: name,
    email: email,
  };

  // Adiciona o novo usuário ao array users
  users.push(newUser);

  // Responde com sucesso e o novo usuário adicionado
  res.status(200) // Corrigido para usar status
  res.redirect('/users'); // Redireciona para a página de listagem
});

exports.listUsers = ((req, res) => {
  res.render("index", { users: users });
})
