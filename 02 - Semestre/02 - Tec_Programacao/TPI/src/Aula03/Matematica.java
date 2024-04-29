package Aula03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Matematica {

    public int pot(int base, int potencia) {
        if (potencia == 0) return 1;
        
        return base * (pot(base, potencia - 1));
    }


}
