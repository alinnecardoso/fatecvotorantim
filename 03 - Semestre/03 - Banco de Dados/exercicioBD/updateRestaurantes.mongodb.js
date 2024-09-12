use('exercicio')
db.restaurantes.find().forEach((restaurante) => {
    db.restaurantes.updateOne(
        {
            _id: restaurante._id,
        },
        {
            $set: {
                local: {
                    type: 'Point',
                    coordinates: [restaurante.coord[0], restaurante.coord[1]]
                },
            },
            $unset: {
                coord: ''
            }
        },
    )
})

use('exercicio')
db.restaurantes.find({},{coord:1})
