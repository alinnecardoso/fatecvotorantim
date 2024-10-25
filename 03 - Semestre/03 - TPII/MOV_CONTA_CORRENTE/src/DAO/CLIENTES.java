/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class CLIENTES {

    private int idCli;
    private String nomeCli;
    private String endeCli;
    private String numeCli;
    private String complCli;
    private String bairCli;
    private String cidaCli;
    private String ufCli;
    private String cepCli;
    private String foneCli;
    private String cpfCli;
    private String dataNasc;
    private String cnpjCli;

    public CLIENTES(int idCli, String nomeCli, String endeCli, String numeCli, String complCli, String bairCli, String cidaCli, String ufCli, String cepCli, String foneCli, String cpfCli, String dataNasc, String cnpjCli) {
        this.idCli = idCli;
        this.nomeCli = nomeCli;
        this.endeCli = endeCli;
        this.numeCli = numeCli;
        this.complCli = complCli;
        this.bairCli = bairCli;
        this.cidaCli = cidaCli;
        this.ufCli = ufCli;
        this.cepCli = cepCli;
        this.foneCli = foneCli;
        this.cpfCli = cpfCli;
        this.dataNasc = dataNasc;
        this.cnpjCli = cnpjCli;
    }

    public CLIENTES() {
    }

    public String dadosSQLValues() {
        String dadosClientes;
        dadosClientes = "'"
                + this.getIdCli() + "','"
                + this.getNomeCli() + "','"
                + this.getEndeCli() + "','"
                + this.getNumeCli() + "','"
                + this.getComplCli() + "','"
                + this.getBairCli() + "','"
                + this.getCidaCli() + "','"
                + this.getUfCli() + "','"
                + this.getCepCli() + "','"
                + this.getFoneCli() + "','"
                + this.getCpfCli() + "','"
                + this.getDataNasc() + "','"
                + this.getCnpjCli() + "'";

        return dadosClientes;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public void setEndeCli(String endeCli) {
        this.endeCli = endeCli;
    }

    public void setNumeCli(String numeCli) {
        this.numeCli = numeCli;
    }

    public void setComplCli(String complCli) {
        this.complCli = complCli;
    }

    public void setBairCli(String bairCli) {
        this.bairCli = bairCli;
    }

    public void setCidaCli(String cidaCli) {
        this.cidaCli = cidaCli;
    }

    public void setUfCli(String ufCli) {
        this.ufCli = ufCli;
    }

    public void setCepCli(String cepCli) {
        this.cepCli = cepCli;
    }

    public void setFoneCli(String foneCli) {
        this.foneCli = foneCli;
    }

    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setCnpjCli(String cnpjCli) {
        this.cnpjCli = cnpjCli;
    }

    public int getIdCli() {
        return idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public String getEndeCli() {
        return endeCli;
    }

    public String getNumeCli() {
        return numeCli;
    }

    public String getComplCli() {
        return complCli;
    }

    public String getBairCli() {
        return bairCli;
    }

    public String getCidaCli() {
        return cidaCli;
    }

    public String getUfCli() {
        return ufCli;
    }

    public String getCepCli() {
        return cepCli;
    }

    public String getFoneCli() {
        return foneCli;
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getCnpjCli() {
        return cnpjCli;
    }

}
