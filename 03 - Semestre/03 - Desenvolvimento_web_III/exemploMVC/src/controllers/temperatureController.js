const temperatureModel = require('../models/temperatureModel')
const temperature = new temperatureModel()

exports.Send = ((req, resp) => {
  var result = temperature.Converter(req.body.type, req.body.temperature)
    resp.render("temperature/temperatureListView", { newTemp: result })
})

exports.Convert = ((req, resp) => {
    resp.render("temperature/temperatureFormView")
})