/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11;


/**
 *
 * @author Alunos
 */
public class Fundamental extends Aluno {

    public Fundamental(String nome, int idade, Genero genero) {
        super(nome, idade, genero);
    }

    @Override
    public String getNota() {
        //Na classe Fundamental o método getNotas deverá retornar valores de A à D, já a classe Colegial
        //deverá retornar valores de 0 à 10 .
        //Sendo A{10,9}, B{8,7}, C{6,5}, D{>5}
        if(super.nota == 10 || super.nota == 9 ){
           return "A";
        }
        if(super.nota == 8 || super.nota == 7){
            return "B";
        }
        if(super.nota == 6 || super.nota == 5){
            return "C";
        }
        else
            return "D";
        
    }
    
}
