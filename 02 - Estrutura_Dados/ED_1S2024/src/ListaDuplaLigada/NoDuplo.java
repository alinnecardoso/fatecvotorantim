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
    
    //CONSTRUTORES
    public NoDuplo(Object info, NoDuplo proximoNo){
        this.info = info;
        this.proximoNo = proximoNo;
    }
}
