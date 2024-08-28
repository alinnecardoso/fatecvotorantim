const express = require('express')
const router = express.Router()

const temperatureController = require('../controllers/temperatureController')

router.get('/temperature', temperatureController.Convert)
router.post('/temperature-send', temperatureController.Send)
module.exports = router

