/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

//import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
//import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// import javax.swing.table.AbstractTableModel;
 
/**
*
* @author Prof. Corredato - Controle de conexão com o banco de dados
*/
public class connectDAO {
    //obs: DAO -> Data access object
    Connection con;
    public Connection connectDB(){
        //JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return con;
        // con.close();
    }
    
    public void insereRegistroJFBD(String tabela, String strDados){
        con = connectDB();
        Statement stmt;
        try{
            stmt = con.createStatement();
            String sql = "INSERT INTO dbo." +tabela+ " "+ "VALUES (" + strDados+")";
            JOptionPane.showMessageDialog(null, "String de Insert: "+ sql);
            try{
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Insert executado com sucesso!");
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem =>"+ erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado =>"+ erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código =>"+ erro.getErrorCode());
            }
            con.close();
        }catch(SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public CLIENTES pesquisaClienteJFBD(String tabela, String pesquisaId){
        CLIENTES clientesReturn = new CLIENTES();
        String tabelaSGBD = "CLIENTES";
        if(tabela.equals(tabelaSGBD)){
            //FAZER A PESQUISA E RETORNAR A TABELA COMO RESULTADO
            con = connectDB(); //Executa o método que conecta no DB e retorna a conexão
            
            Statement stmt;
            
            try{
                stmt = con.createStatement();
                //Cria a string com a sentença SQL para inserir registro
                
                String sql = "SELECT * FROM "+tabela
                        + " WHERE "+pesquisaId;
                
                JOptionPane.showMessageDialog(null, "String de Select: "+ sql);
                
                try{
                    //Executar a sentença de insert
                    // stmt = con.prepareStatement(sql);
                    //JOptionPane.showMessageDialog(null, "Vai executar a query com: "+sql);
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    JOptionPane.showMessageDialog(null, "Pesquisa Cliente - Executada com Sucesso");
                    if(dados.next() == false){
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para"+ sql);
                    }else{
                        //Pega os dados que vieram do SELECT e repasse o objeto que será
                        // clientesReturn = new CLIENTES(new CLIENTES());
                        
                        clientesReturn.setIdCli(dados.getInt(1));
                        clientesReturn.setNomeCli(dados.getString(2));
                        clientesReturn.setEndeCli(dados.getString(3));
                        clientesReturn.setNumeCli(dados.getString(4));
                        clientesReturn.setComplCli(dados.getString(5));
                        clientesReturn.setBairCli(dados.getString(6));
                        clientesReturn.setCidaCli(dados.getString(7));
                        clientesReturn.setUfCli(dados.getString(8));
                        clientesReturn.setCepCli(dados.getString(9));
                        clientesReturn.setFoneCli(dados.getString(10));
                        clientesReturn.setCpfCli(dados.getString(11));
                        clientesReturn.setDataNasc(dados.getString(12));
                        clientesReturn.setCnpjCli(dados.getString(13));
                        
                        System.out.println("Cliente encontrado connectdao: " + clientesReturn.getIdCli() + ", " + clientesReturn.getNomeCli());
                        
                    }
                } catch(SQLException erro){
                    JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO Consulta - Mensagem => "+ erro);
                    System.out.println("Erro de conexão, connectDAO Consulta - Mensagem => "+ erro);
                    JOptionPane.showMessageDialog(null,"\n Erro de conexão, connectDAo - Estado"+ erro);
                    System.out.println("\n Erro de conexão, connectDAo - Estado"+ erro);
                    JOptionPane.showMessageDialog(null,"\n Erro de conexão, connectDAO - Código"+ erro);
                    System.out.println("\n Erro de conexão, connectDAO - Código"+ erro);
                }
                con.close();
            }catch (SQLException ex){
                Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } //Final do processo para tabela CLIENTES
        // System.out.println("chegou no return clientesReturn ");
    
        return clientesReturn;
        
    }
    
    public void alteraRegistroJFBD(String tabela, String strDados, String pesquisaID){
        con = connectDB();
        
        Statement stmt;
        try{
            stmt = con.createStatement();
            String sql = "UPDATE dbo."+tabela
                    + " SET "+ strDados
                    + " WHERE ("+pesquisaID+");";
            System.out.println("String de Select: "+sql);
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Alteração executada com Sucesso");
            
            try{
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Alteração executada com sucesso!");
            }catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO Consulta - Mensagem => "+ erro);
                System.out.println("ALTERA REGISTRO - Erro de conexão, connectDAO Consulta - Mensagem => "+erro);
                JOptionPane.showMessageDialog(null,"\n Erro de conexão, connectDAo - Estado"+ erro);
                JOptionPane.showMessageDialog(null,"\n Erro de conexão, connectDAO - Código"+ erro);
            }
        }catch (SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
