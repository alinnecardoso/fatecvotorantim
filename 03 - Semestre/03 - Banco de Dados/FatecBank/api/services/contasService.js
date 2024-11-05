import { ObjectId, ReadConcern, WriteConcern } from "mongodb";

async function transferirFundos(client, deContaId, paraContaId, valor){
    const session = client.startSession();

    try {
        await session.withTransation(async() => {
            const contasColletion = client.db('fatecBank').colletion('contas')

            if(valor < 0){
                throw new Error('Valor não pode ser negativo')
            }

            await contasColletion.updateOne({_id: ObjectId.createFromHexString(deContaId)},{
                $push: {
                    movimentacoes:{
                        tipo: 'debito',
                        valor: valor,
                        descricao: 'Tranferência enviada',
                        data: new Date()
                    }
                }
            }, {
                session
            });


            await contasColletion.updateOne({_id: ObjectId.createFromHexString(paraContaId)},{
                $push: {
                    movimentacoes:{
                        tipo: 'crédito',
                        valor: valor,
                        descricao: 'Tranferência recebida',
                        data: new Date()
                    }
                }
            },
            {session});
        }, {
            /*
                Níveis de concern
                local -> somente local, sem verificar réplicas
                majority -> leitura da maioria das réplicas > 50%
                linearizable -> leitura linear, garante consitência
                available -> prioriza a disponibilidade, leitura em outros nós
            */

           ReadConcern: { level: 'majority' },
           WriteConcern: { w: 'majority' },
           maxCommitTimeMS: 5000 //5 seg
        })
        
        await session.commitTransation();
        console.log('Tranferência efetuada!');
        return { message: 'Transferência efetuada com sucesso' };

    } catch (error) {
        //await sesstion.abortTransation()
        console.log('Ocorreu um erro: ', error);
        return { error: error.message }
    } finally{
        session.endSession();
    }
}

export { transferirFundos };
