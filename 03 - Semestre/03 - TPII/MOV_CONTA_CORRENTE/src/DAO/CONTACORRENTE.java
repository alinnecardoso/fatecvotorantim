/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class CONTACORRENTE {
    private int numAge;
    private int numCC;
    private int idCli;
    private float saldo; //Perguntar para o professor sobre o tipo da variável

    public CONTACORRENTE(int numAge, int numCC, int idCli, float saldo) {
        this.numAge = numAge;
        this.numCC = numCC;
        this.idCli = idCli;
        this.saldo = saldo;
    }

    public CONTACORRENTE() {
    }

    public String dadosSQLInsert(){
        String dados_CC;
        dados_CC = "'"
                + this.getNumAge() + "','"
                + this.getNumCC() + "','"
                + this.getIdCli() + "','"
                + this.getSaldo() + "'";
        return dados_CC;
    }
    
    public int getNumAge() {
        return numAge;
    }

    public int getNumCC() {
        return numCC;
    }

    public int getIdCli() {
        return idCli;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
}
