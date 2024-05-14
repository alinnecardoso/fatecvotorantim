/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaDados;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alunos
 */
public class Serializador {
    //MÉTODO GRAVAR
        //Recebe o caminho do arquivo e o objeto
    public static void gravar(String endereco, Object obj) 
            throws FileNotFoundException, IOException{
        
        FileOutputStream outFile = new FileOutputStream(endereco);
        
        ObjectOutputStream s = new ObjectOutputStream(outFile);
        
        s.writeObject(obj);
        
        s.close();
        
    }
    //MÉTODO LER
    public static Object ler(String endereco) 
            throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream inFile = new FileInputStream(endereco);
        
        ObjectInputStream s = new ObjectInputStream(inFile);
        
        Object obj = s.readObject();
        
        s.close();
        
        return obj;
    }
}
