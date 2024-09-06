const UserModel = require('../model/user');

const userModel = new UserModel();
let users = userModel.getAll();


exports.getForms = (req, res) => {
  /*
    #swagger.tags = ['Forms']
    #swagger.summary = 'Exibe o formulário de cadastro'
    #swagger.description = 'Renderiza a página com o formulário para cadastro de usuários'
  */
  const message = {}; 
  res.render("index", { message });
};

exports.postForms = (req, res) => {
  /*
    #swagger.tags = ['Forms']
    #swagger.summary = 'Cadastro de novo usuário'
    #swagger.description = 'Recebe os dados do formulário e salva um novo usuário, verificando se o e-mail já existe.'
  */

  const { name, email } = req.body;

  const newUser = {
    name: name,
    email: email,
  };

  // Verifica se o email já existe na lista de usuários
  const existingUser = users.find((user) => user.email === email);

  if (existingUser) {
    // Exibe mensagem de erro e interrompe a execução se o email já existir
    return res.render('index', {
      message: { type: 'danger', text: 'Esse email já existe' }
    });
  }

  // Salva o novo usuário se o email não existir
  userModel.save(newUser);

  // Exibe mensagem de sucesso após a criação do usuário
  res.render('index', {
    message: { type: 'success', text: 'Usuário cadastrado com sucesso!' }
  });
};

exports.listUsers = (req, res) => {
  /*
    #swagger.tags = ['Users']
    #swagger.summary = 'Lista todos os usuários'
    #swagger.description = 'Renderiza a página de administração com a lista de usuários.'
  */

  res.render("adm", { users });
};

exports.deleteUserByEmail = (req, res) => {
  /*
    #swagger.tags = ['Users, email']
    #swagger.summary = 'Deleta um usuário por email'
    #swagger.description = 'Remove um usuário da lista com base no email fornecido.'
  */

  const { email } = req.params;

  for (let i = 0; i < users.length; i++) {
    if (users[i].email === email) {
      users = userModel.delete(email);
      res.redirect('/users')
      res.status(200).json({ deleted: true });
      return;
    }
  }
  
  // Se o usuário não for encontrado, retorna um erro
  res.status(400).json({ error: 'User not found' });
};

exports.countUsers = (req, res) => {
  /*
    #swagger.tags = ['Users']
    #swagger.summary = 'Conta o número de usuários'
    #swagger.description = 'Retorna a contagem total de usuários cadastrados.'
  */

  const count = users.length;
  res.status(200).json({ count });
};
