use('geo')
db.estados.find().forEach((estado) =>{
    db.estados.updateOne(
        {
            _id: estado._id,
        },
        {
            $set: {
                local: {
                    type: 'Point',
                    coordinates: [estado.longitude, estado.latitude]
                },
            },
            $unset: {
                latitude:'',
                longitude:'',
            }
        }
    )
})

use('geo')
db.estados.find({}, {nome:1, local:1})