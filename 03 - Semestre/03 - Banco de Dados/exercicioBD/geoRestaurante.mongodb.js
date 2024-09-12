const fs = require('fs');

const dadosRestaurantes = fs.readFileSync("json/restaurantes.json")

const jsonRestaurantes = JSON.parse(dadosRestaurantes);

use('exercicio')
db.restaurantes.insertMany(jsonRestaurantes)
db.restaurantes.createIndex({restaurante_id:1}, {unique: true,
    name: "idx_restaurantes_restauranteId"
})

db.restaurantes.find().count()
