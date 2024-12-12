/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class MOVIMENTACAO {
    private int numAge;
    private int numCC;
    private String dataMov;
    private String numDocto;
    private String debitoCredito;
    private int idHis;
    private String complHis;
    private int valor;
    private float saldo;

    public MOVIMENTACAO(int numAge, int numCC, String dataMov, String numDocto, String debitoCredito, int idHis, String complHis, int valor, float saldo) {
        this.numAge = numAge;
        this.numCC = numCC;
        this.dataMov = dataMov;
        this.numDocto = numDocto;
        this.debitoCredito = debitoCredito;
        this.idHis = idHis;
        this.complHis = complHis;
        this.valor = valor;
        this.saldo = saldo;
    }
    
    public String dadosSQLValues(){
        String dadosMovimentacao;
        dadosMovimentacao= "'"
                + this.getNumAge() + "','"
                + this.getNumCC() + "','"
                + this.getDataMov() + "','"
                + this.getNumDocto() + "','"
                + this.getDebitoCredito() + "','"
                + this.getIdHis() + "','"
                + this.getComplHis() + "','"
                + this.getValor() + "','"
                + this.getSaldo() + "'";
        
        return dadosMovimentacao;
    }
    
    public String alteraDadosSQlValues(){
        String dadosClientes;
        dadosClientes = "NUM_AGE='"
                + this.getNumAge()+ "',NUM_CC='"
                + this.getNumCC()+ "',DATA_MOV='"
                + this.getDataMov()+ "',NUM_DOCTO='"
                + this.getNumDocto()+ "',DEBITO_CREDITO='"
                + this.getDebitoCredito()+ "',ID_HIS='"
                + this.getIdHis()+ "',COMPL_HIS='"
                + this.getComplHis()+ "',VALOR='"
                + this.getValor()+ "',SALDO='"
                + this.getSaldo()+ "'";
        
        //System.out.println("alteraDadosSQlValues - "+dadosClientes);
        return dadosClientes;
    }

    public MOVIMENTACAO() {
    }

    public int getNumAge() {
        return numAge;
    }

    public int getNumCC() {
        return numCC;
    }

    public String getDataMov() {
        return dataMov;
    }

    public String getNumDocto() {
        return numDocto;
    }

    public String getDebitoCredito() {
        return debitoCredito;
    }

    public int getIdHis() {
        return idHis;
    }

    public String getComplHis() {
        return complHis;
    }

    public int getValor() {
        return valor;
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

    public void setDataMov(String dataMov) {
        this.dataMov = dataMov;
    }

    public void setNumDocto(String numDocto) {
        this.numDocto = numDocto;
    }

    public void setDebitoCredito(String debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public void setComplHis(String complHis) {
        this.complHis = complHis;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
