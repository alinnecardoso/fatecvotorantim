const mongoose = require('mongoose');
const Schema = mongoose.Schema;
let userSchema = new Schema(
    {
        name: {
            type:String,
            required:true,
            max: 100
        },
        age: {
            type: Number,
            required:true,
        },
    }
)

module.exports = mongoose.model('User', userSchema);
