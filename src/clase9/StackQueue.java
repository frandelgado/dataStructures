package clase9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackQueue {
    // Programa que mediante un menú presenta las sigueites operaciones sobre una pila y cola de colores
    // 1. Ingresar un color a la pila
    // 2. Ingresar un color a la cola
    // 3. Visualizar si un color dado esta en la pila
    // 4. Buscar un color introducido por el usuario en la cola, si existe entonces visualizar un mensaje
    //    En caso contratio, ingresarlo a la cola.
    // 5. Visualizar la pila de colores
    // 6. Visualizar la cola de colores
    // 7. Salir

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        Queue<String> cola = new LinkedList<>();

        Scanner in = new Scanner(System.in);

        System.out.println(
                "Las operaciónes disponibles son: \n" +
                        "1. Ingresar color a la pila\n" +
                        "2. Ingresar un color a la cola\n" +
                        "3. Visualizar si un color dado esta en la pila\n" +
                        "4. Buscar en la cola, si no esta, ingresarlo\n" +
                        "5. Visualizar la pila de colores\n" +
                        "6. Visualizar la cola de colores\n" +
                        "8. Borrar un color especifico de la cola\n" +
                        "9. salir\n"
        );
        int option;
        String color;
        do {
            System.out.println("Ingrese una opción");
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese un color a la pila");
                    color = in.next();
                    pila.push(color);
                    break;
                case 2:
                    System.out.println("Ingrese un color a la cola");
                    color = in.next();
                    cola.add(color);
                    break;
                case 3:
                    System.out.println("Ingrese el color a buscar en la pila");
                    color = in.next();
                    if (pila.contains(color)) {
                        System.out.println("La pila contiene el color" + color);
                    } else {
                        System.out.println("La pila no contiene el color:" + color);
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el color a buscar en la cola");
                    color = in.next();
                    if (cola.contains(color)) {
                        System.out.println("La cola contiene el color" + color);
                    } else {
                        cola.add(color);
                        System.out.println("Se agrego el color " + color + " a la cola");
                    }
                    break;
                case 5:
                    System.out.println("Visualizando la pila");
                    for(String elem : pila){
                        System.out.println(elem);
                    }
                    break;
                case 6:
                    System.out.println("Visualizando la cola");
                    for (String elem : cola){
                        System.out.println(elem);
                    }
                    break;
                    // verde
                    // amarillo
                case 7:
                    color = cola.remove();
                    System.out.println("Se elemino el color " + color + "de la cola");
                    break;
                case 8:
                    color = pila.pop();
                    System.out.println("Se elemino el color " + color + "de la pila");
                    break;

                case 9:
                    System.out.println("Ingrese el color a borrar");
                    color = in.next();
                    Queue<String> aux = new LinkedList<>();
                    for(String elem : cola) {
                        if(!elem.equals(color)) {
                            aux.add(elem);
                        }
                    }
                    cola = aux;
                    break;
                case 10:
                    System.out.println("Ingrese el color a borrar de la pila");
                    color = in.next();
                    Stack<String> aux2 = new Stack<>();
                    for (String elem: pila) {
                        if(!elem.equals(color)) {
                            aux2.push(color);
                        }
                    }
                    pila = new Stack<>();
                    for (String elem : aux2){
                        pila.push(elem);
                    }
                case 11:
                    break;
            }
        } while(option != 11);
    }

}
