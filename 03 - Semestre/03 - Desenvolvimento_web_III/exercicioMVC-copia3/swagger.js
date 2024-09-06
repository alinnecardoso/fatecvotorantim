const swaggerAutogen = require('swagger-autogen')({ openapi: '3.1.0' });

const doc = {
  info: {
    version: '1.0.0',
    title: 'MVC Exercicio',
    description: 'Showing how to use mvc'
  },
  servers: [
    {
      url: 'http://localhost:3000'
    }
  ],
};

const outputFile = './swagger-output.json';
const endpointsFile = ['./index.js'];

swaggerAutogen(outputFile, endpointsFile, doc).then(() => {
  require('./')
})