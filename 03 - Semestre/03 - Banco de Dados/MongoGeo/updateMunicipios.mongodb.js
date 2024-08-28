use('geo')
db.municipios.find().forEach((municipio) =>{
    db.municipios.updateOne(
        {
            _id: municipio._id,
        },
        {
            $set: {
                local: {
                    type: 'Point',
                    coordinates: [municipio.longitude, municipio.latitude]
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
db.municipios.find({}, {nome:1, local:1})