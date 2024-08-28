//Criando os índices 2dsphere
use('geo')
db.estados.createIndex({local: '2dsphere'})

use('geo')
db.municipios.createIndex({local: '2dsphere'})

//Encontrar um ponto próximo a uma localização específica
use('geo')
db.municipios.find(
    {
        local: {
            $near: {
                $geometry: {
                    type: "Point",
                    coordinates: [-47.4495, -23.5313], //Fatec Votorantim
                },
                $maxDistance: 50000, //Em metros (50km)
            },
        },
    },
    {
        nome:1,
        _id:0,
    },
)

//Encontrar pontos em um raio (Círculo)
use('geo')
db.municipios.find(
    {
        local: {
            $geoWithin: {
                $centerSphere: [
                    [-47.4495, -23.5313],
                    20 / 6378.1 //raio em metro
                ],
            },
        },
    },
    {
        nome: 1,
        _id:0
    }
)
//6378.10 é o raio médio da Terra em km, necessário para converter em radianos

//Encontrar pontos dentro de um polígono
use('geo')
db.municipios.find(
    {
        local: {
            $geoWithin: {
                $polygon: [
                    [
                        -46.99026328091253,
                        -23.70083192073065
                      ],
                      [
                        -46.97310235626014,
                        -22.734655277813374
                      ],
                      [
                        -48.512603483877285,
                        -22.78966843788203
                      ],
                      [
                        -48.6860731497992,
                        -23.512367129597834
                      ],
                      [
                        -48.279580845878115,
                        -24.22096921709465
                      ],
                      [
                        -47.324195072772426,
                        -24.17768377867482
                      ],
                      [
                        -46.99026328091253,
                        -23.70083192073065
                      ]
                ],
            },
        },
    },
    {
        nome:1,
        _id: 0,
    },
).count()

//Localizando todos os pontos dentro de uma caixa (box)
use('geo')
db.municipios.find(
    {
        local: {
            $geoWithin: {
                $box: [
                    [-51.66, -21.24], //canto inferior esquerdo
                    [-49.98, -23.66] // canto superior direito
                ]
            },
        },
    },
    {
        nome:1,
        _id: 0,
    },
)