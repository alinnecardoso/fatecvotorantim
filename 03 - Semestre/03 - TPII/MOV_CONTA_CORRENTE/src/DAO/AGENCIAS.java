/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class AGENCIAS {
    private int numAge;
    private String nomeAge;
    private String endeAge;
    private String numeAge;
    private String complAge;
    private String bairAge;
    private String cidaAge;
    private String ufAge;
    private String cepAge;
    private String foneAge;

    public AGENCIAS(int numAge, String nomeAge, String endeAge, String numeAge, String complAge, String bairAge, String cidaAge, String ufAge, String cepAge, String foneAge) {
        this.numAge = numAge;
        this.nomeAge = nomeAge;
        this.endeAge = endeAge;
        this.numeAge = numeAge;
        this.complAge = complAge;
        this.bairAge = bairAge;
        this.cidaAge = cidaAge;
        this.ufAge = ufAge;
        this.cepAge = cepAge;
        this.foneAge = foneAge;
    }

    public AGENCIAS() {
    }
    
    public String dadosSQLValues(){
        String dadosAgencias;
        dadosAgencias = "'"
                + this.getNumAge() + "','"
                + this.getNomeAge() + "','"
                + this.getEndeAge() + "','"
                + this.getNumeAge() + "','"
                + this.getComplAge() + "','"
                + this.getBairAge() + "','"
                + this.getCidaAge() + "','"
                + this.getUfAge() + "','"
                + this.getCepAge() + "','"
                + this.getFoneAge() + "'";
        
        return dadosAgencias;
    }

    public int getNumAge() {
        return numAge;
    }

    public String getNomeAge() {
        return nomeAge;
    }

    public String getEndeAge() {
        return endeAge;
    }

    public String getNumeAge() {
        return numeAge;
    }

    public String getComplAge() {
        return complAge;
    }

    public String getBairAge() {
        return bairAge;
    }

    public String getCidaAge() {
        return cidaAge;
    }

    public String getUfAge() {
        return ufAge;
    }

    public String getCepAge() {
        return cepAge;
    }

    public String getFoneAge() {
        return foneAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public void setNomeAge(String nomeAge) {
        this.nomeAge = nomeAge;
    }

    public void setEndeAge(String endeAge) {
        this.endeAge = endeAge;
    }

    public void setNumeAge(String numeAge) {
        this.numeAge = numeAge;
    }

    public void setComplAge(String complAge) {
        this.complAge = complAge;
    }

    public void setBairAge(String bairAge) {
        this.bairAge = bairAge;
    }

    public void setCidaAge(String cidaAge) {
        this.cidaAge = cidaAge;
    }

    public void setUfAge(String ufAge) {
        this.ufAge = ufAge;
    }

    public void setCepAge(String cepAge) {
        this.cepAge = cepAge;
    }

    public void setFoneAge(String foneAge) {
        this.foneAge = foneAge;
    }
    
    
}
