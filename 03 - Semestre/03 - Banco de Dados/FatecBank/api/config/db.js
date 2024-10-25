import {MongoClient} from 'mongodb';

import { config } from 'dotenv';

config(); //Carrega as Varáveis do .env

const { MONGODB_URI, MONGODB_DB } = process.env;

let client;

async function connectToDataBase(){
    if(!client){
        client = new MongoClient(MONGODB_URI);
        await client.connect();
        console.log('🌿 Conectado ao MongoDB');
    }
    return client;
}
export {connectToDataBase, MONGODB_DB};

