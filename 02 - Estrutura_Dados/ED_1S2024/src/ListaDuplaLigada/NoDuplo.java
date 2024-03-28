/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDuplaLigada;

/**
 *
 * @author alinn
 */
public class NoDuplo {
    
    //ATRIBUTOS
    Object info;
    NoDuplo proximoNo;
    NoDuplo anteriorNo;
    
    //CONSTRUTORES
    public NoDuplo(Object info, NoDuplo proximoNo){
        this.info = info;
        this.proximoNo = proximoNo;
    }
    // Métodos Get
    public Object getInfo() {
        return info;
    }

    public NoDuplo getProximoNo() {
        return proximoNo;
    }

    public NoDuplo getAnteriorNo() {
        return anteriorNo;
    }
    

    //Métodos Set
    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximoNo(NoDuplo proximoNo) {
        this.proximoNo = proximoNo;
    }

    public void setAnteriorNo(NoDuplo anteriorNo) {
        this.anteriorNo = anteriorNo;
    }
    
    
    
    
    
}
