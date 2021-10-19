package clase8;

import clase4.Punto;

public class Lista {
    private Nodo inicio;
    private int longitud;

    //Constructores

    public Lista(){}

    public Lista(Nodo inicio, int longitud){
        this.inicio=inicio;
        this.longitud=longitud;
    }
    // Analizadores
    public Nodo getInicio() {
        return inicio;
    }

    public int getLongitud() {
        return longitud;
    }

    // Modificadores
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean esVacia(){
        if(this.inicio==null)
            return true;
        else
            return false;

    }
    // Agregar Nodo inicio lista
    public void agregarNodoInicio(Nodo nodo){
        if (this.esVacia()){
            this.inicio=nodo;
        }
        else{
            nodo.setSiguiente(this.inicio);
            this.inicio=nodo;
        }
        this.longitud++;
    }

    // ver lista
    public void mostrarLista(){
        if(this.esVacia()){
            System.out.println("lista Vacia");
        }
        else{
            Nodo buscar=this.inicio;
            int i=0;
            while(i<this.longitud){
                System.out.println(buscar.getValor());
                i++;
                buscar=buscar.getSiguiente();
            }
        }
    }

    /**
     * Mueve el último elemento al principio de la lista
     */
    public void moverAlFrente(){
        if(longitud < 2) {
            return;
        }
        Nodo ultimo = this.inicio.getSiguiente();
        Nodo anteultimo = this.inicio;
        while(ultimo.getSiguiente() != null){
            anteultimo = ultimo;
            ultimo = ultimo.getSiguiente();
        }
        anteultimo.setSiguiente(null);
        ultimo.setSiguiente(this.inicio);
        this.inicio = ultimo;

    }

    /**
     * Imprime la lista en orden inverso
     */
    public void imprimirAlRevez(){
        imprimirAlRevez(this.inicio);
        int i = 4596;
    }
    // 15, 10, 5
    public void imprimirAlRevez(Nodo nodo){
        // Caso base
        if(nodo == null){
            return;
        }

        // llamada recursiva
        imprimirAlRevez(nodo.getSiguiente());

        // trabajo sobre el paso actual
        System.out.println(nodo.getValor());

    }

    public static int invernum(int numero,int reves){
        if(numero/10>=1) {
            reves=numero%10+reves*10;
            numero=numero/10;
            return invernum(numero,reves);
        }
        else{
            return reves*10+numero;
        }
    }

    public int calcularLongitud() {
        return calcularLongitud(this.inicio);
    }

    int calcularLongitud(Nodo nodo){
        if(nodo == null){
            return 0;
        }
        int longitud = 1;
        longitud += calcularLongitud(nodo.getSiguiente());
        return longitud;
    }

    /**
     * Dado un punto, borra el nodo que contiene ese punto de la lista
     * @param punto
     */
    public void borrarNodo(Punto punto) {
        borrarNodo(this.inicio, punto, null);
    }
    // 15 - 10 - 5 - 3
    public Nodo borrarNodo(Nodo nodo, Punto punto, Nodo anterior) {
        // caso base
        if(nodo == null){
            return null;
        }
        // trabajo sobre el paso actual
        if(nodo.getValor().equals(punto)){
            if(anterior == null){
                return nodo.getSiguiente();
            }
            else if (nodo.getSiguiente() == null) {
                return null;
            }
            else {
                return nodo.getSiguiente();
            }
        }
        // llamada recursiva
        Nodo siguiente = borrarNodo(nodo.getSiguiente(), punto, nodo);
        // trabajo sobre el paso actual
        nodo.setSiguiente(siguiente);
        return nodo;
    }

}
