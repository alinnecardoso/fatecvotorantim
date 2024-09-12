var User = require('../models/userModel');

exports.getUser = async (req,res) =>{
    try {
        const result = await User.find();
        res.status(200).json(result)
    } catch (error) {
        res.status(500).json(error)
    }
};

exports.create = (req,res) => {
    let user = new User(
        {
            name: req.body.name,
            age: req.body.age
        }
    );
    user.save()
        .then(res.status(201).send(user.toJSON()))
        .catch((error) =>{
            res.status(500).send({message: `${error.message} - Falha ao cadastar usuário.`})
        })
};

exports.details = async (req, res) =>{
    try {
        const result = await User.findById(req.params.id);
        res.status(200).json(result)
    } catch (error) {
        res.status(500).json(error)
    }
}
