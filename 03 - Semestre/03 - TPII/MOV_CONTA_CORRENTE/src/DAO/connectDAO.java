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

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
 
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
    
    public <T> T pesquisaRegistroJFBD(String tabela, String pesquisaId, Class<T> clazz) {
        T result = null;
        con = connectDB();

        if (con != null) {
            String sql = "SELECT * FROM " + tabela + " WHERE " + pesquisaId;
            JOptionPane.showMessageDialog(null, "String de Select: " + sql);

            try (Statement stmt = con.createStatement(); ResultSet dados = stmt.executeQuery(sql)) {
                if (!dados.next()) {
                    JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para: " + sql);
                } else {
                    result = clazz.getDeclaredConstructor().newInstance();

                    for (Field field : clazz.getDeclaredFields()) {
                        field.setAccessible(true);
                        try {
                            Object value = dados.getObject(field.getName());
                            field.set(result, value);
                        } catch (IllegalArgumentException | IllegalAccessException e) {
                            Logger.getLogger(connectDAO.class.getName()).log(Level.WARNING, "Erro ao definir campo: " + field.getName(), e);
                        }
                    }

                    System.out.println("Registro encontrado: " + result);
                }
            } catch (SQLException ex) {
                Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, "Erro ao executar a consulta", ex);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, "Erro ao instanciar a classe", e);
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                    Logger.getLogger(connectDAO.class.getName()).log(Level.WARNING, "Erro ao fechar a conexão", e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
        }

        return result;
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
                //System.out.println("ALTERA REGISTRO - Erro de conexão, connectDAO Consulta - Mensagem => "+erro);
                JOptionPane.showMessageDialog(null,"\n Erro de conexão, connectDAo - Estado"+ erro);
                JOptionPane.showMessageDialog(null,"\n Erro de conexão, connectDAO - Código"+ erro);
            }
        }catch (SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluiRegistroJFBD(String tabela, String pesquisaID) {
        con = connectDB();

        if (con != null) {
            String sql = "DELETE FROM dbo." + tabela + " WHERE " + pesquisaID;

            try (Statement stmt = con.createStatement()) {
                System.out.println("String de Delete: " + sql);
                int rowsAffected = stmt.executeUpdate(sql);
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Exclusão executada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum registro encontrado para excluir.");
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO Exclusão - Mensagem => " + erro);
                Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                    Logger.getLogger(connectDAO.class.getName()).log(Level.WARNING, "Erro ao fechar a conexão", e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
        }
    }

    
}
