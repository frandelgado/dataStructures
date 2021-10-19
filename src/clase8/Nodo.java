package clase8;


import clase4.Punto;

public class Nodo {

    private Punto valor;
    private Nodo siguiente;

    // Constructores

    public Nodo(){}

    public Nodo(Punto valor){
        this.valor=valor;
        this.siguiente=null;
    }
    // Analizadores
    public Punto getValor() {
        return valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }

    // Modificadores
    public void setValor(Punto valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}