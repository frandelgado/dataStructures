package clase8;

import clase4.Punto;

public class Ejecutable {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Punto punto = new Punto(5, 5);
        Punto punto1 = new Punto(10, 10);
//        System.out.println(punto);
        Lista lista1 = new Lista();
//        System.out.println("Longitud Lista " + lista1.getLongitud());
        Nodo nuevo = new Nodo(punto);
        Nodo nuevo1 = new Nodo(punto1);
        //System.out.println("Es vacia la lista " + lista1.esVacia());
        lista1.agregarNodoInicio(nuevo);
//        System.out.println("Es vacia la lista " + lista1.esVacia());
//        System.out.println("Longitud Lista " + lista1.getLongitud());
        lista1.agregarNodoInicio(nuevo1);
//        System.out.println("Es vacia la lista " + lista1.esVacia());
//        System.out.println("Longitud Lista " + lista1.getLongitud());
//        System.out.println("lista" + lista1);
        lista1.agregarNodoInicio(new Nodo(new Punto(15, 15)));
        lista1.imprimirAlRevez();
        System.out.println(lista1.calcularLongitud());
    }
}