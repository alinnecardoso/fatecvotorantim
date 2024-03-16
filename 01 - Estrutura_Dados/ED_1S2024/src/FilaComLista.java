
import java.util.ArrayList;
import java.util.List;




public class FilaComLista {
    //DECLARAR OS ATRIBUTOS DO OBJETO
    List fila = new ArrayList<Integer>();
    
    //Métodos da Classe Fila
    //** Adicionar um inteiro no final da fila  **
    
    public void adicionar(Integer item){
        if(item < 60)
            fila.add(item);
            
        else
            fila.add(0, item);
    }
    
    public int tamanho(){
        return fila.size();
    }
    public Object remover() {
        return (Integer)fila.remove(0);
    }

    Object exibirInicio() {
        return (Integer)fila.get(0);
    }
}
