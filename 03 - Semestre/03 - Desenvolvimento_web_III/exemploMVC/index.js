const express = require('express')
const app = express()
const bodyParser = require('body-parser');
const loginRoute = require('./src/routes/loginRoute')
const temperatureRoute = require('./src/routes/temperatureRoute')
const swaggerUI = require('swagger-ui-express');
const swaggerFile = require('./swagger-output.json')

app.use(bodyParser.urlencoded({ extended: false }));
app.use(loginRoute)
app.use(temperatureRoute)

app.use(bodyParser.json());
app.use('/docs', swaggerUI.serve, swaggerUI.setup(swaggerFile));

app.set('view engine', 'ejs')
app.set('views', './src/views/')

app.listen(3000, function(){
    console.log('App rodando na porta 3000')
})
