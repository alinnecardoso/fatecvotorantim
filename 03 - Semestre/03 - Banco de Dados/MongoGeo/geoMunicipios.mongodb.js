const fs = require('fs');

const dadosMunicipios = fs.readFileSync("json/municipios.json")

const jsonMunicipios = JSON.parse(dadosMunicipios);

use('geo')
db.municipios.insertMany(jsonMunicipios)
db.municipios.createIndex({codigo_ibge:1}, {unique:true, name:"idx_municipios_codigoIbge"})

db.municipios.find().count() //5570