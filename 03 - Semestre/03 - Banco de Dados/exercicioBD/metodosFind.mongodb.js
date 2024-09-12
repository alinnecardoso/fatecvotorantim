use('exercicio')
// [01]
db.restaurantes.find({},{restaurante_id:1, nome:1, cozinha:1})

// [02]
use('exercicio')
db.restaurantes.find({},{restaurante_id:1, nome:1, cozinha:1, _id:0})

// [03]
use('exercicio')
db.restaurantes.find({}, {restaurante_id:1, nome:1, bairro:1,"endereço.cep":1, _id:0})

// [04]
use('exercicio')
db.restaurantes.find({bairro: /bronkx/i})

use('exercicio')
db.restaurantes.find()
