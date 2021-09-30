package parciales.simulacroParcial1.ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el primer número complejo");
        Complejo c1 = parseComplex(in);
        printNumberType(c1);
        System.out.println("Ingrese el segundo número complejo");
        Complejo c2 = parseComplex(in);
        printNumberType(c2);
        System.out.println("La magnitud de " + c1.toString() +"  es: " + c1.magnitud());
        System.out.println("La magnitud de " + c2.toString() +"  es: " + c2.magnitud());
        System.out.println("La suma de ambos números es: " + Complejo.suma(c1, c2).toString());

        System.out.println("El complejo 1 es: " + c1.toString());
        System.out.println("El complejo 2 es: " + c2.toString());
    }

    public static Complejo parseComplex(Scanner in){
        System.out.println("Ingrese la componente real del número complejo");
        Double a  = in.nextDouble();
        System.out.println("Ingrese la componente imaginaria del número complejo");
        Double b  = in.nextDouble();
        return new Complejo(a, b);
    }

    public static void printNumberType(Complejo c){
        if (c.isReal()) {
            System.out.println("El número es real");
        } else {
            System.out.println("El número es complejo");
        }
    }
}
