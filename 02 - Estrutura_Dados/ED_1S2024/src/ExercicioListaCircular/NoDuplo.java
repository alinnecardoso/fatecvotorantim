
package ExercicioListaCircular;

public class NoDuplo {
    private NoDuplo proximo, anterior;
    private Object info;

    public NoDuplo(NoDuplo proximo, NoDuplo anterior, Object info) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.info = info;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public Object getInfo() {
        return info;
    }
    
    
}
