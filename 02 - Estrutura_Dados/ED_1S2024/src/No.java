/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class No {
    
    private Object info;
    private No proximoNo;
    
    public No(Object info, No proximoNo){
        this.info = info;
        this.proximoNo = proximoNo;
    }
    
    public Object getInfo(){
        return info;
    }

    public No getProximoNo() {
        return proximoNo;
    }
    
    public void setInfo(Object info){
        this.info = info;
    }
     public void setProximoNo(No proximoNo){
        this.proximoNo = proximoNo;
    }
    
    
}
