import request from 'supertest'
import app from '../index'

describe("Cadastro de Usuário", () => {
    beforeAll(()=>{

    });

    afterAll(()=>{

    });

    beforeEach(()=>{
        //Executado antes de cada teste
    });

    afterEach(()=>{
        //Será executado após cada teste
    })

    it("Deve retornar erro se o nome não for informado", ()=>{
        //Lógica do teste
        let x = 4;
        // Asserções
        expect(x).toBe(2);
    });

    it("Deve retornar sucesso, se os parâmetros estiverem corretor", ()=>{
        expect(null).toBeNull();
    })
});


describe.only("Busca de Usuários", ()=>{
    it("Deve retornar a partir do id", async() =>{
        // const users = ["João", "Pedro", "Maria"];

        // expect(users).toContainEqual<string>("Pedr");

        const response = await request(app).get("/api/v1/user/1");

        expect(response.text).toEqual(
            JSON.stringify({
                id: 1,
                name: "João",
                age: 18
            })
        )
    })
})
