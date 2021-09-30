package tps.tp3;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ojo, aca tenes que arrancar x = 1 para que te de la cantidad correcta de ciclos en el while.
        // Fijate que si x = 2 y n = 3 entonces da solo dos ciclos, pero n indicaría que deberían ser 3
        double num = 5, den = 6, n, x = 1;
        double suma = 0;
        System.out.println("Ingrese la cantidad de términos a ingresar: ");
        n = in.nextInt();
        System.out.println("La serie de " + n + " términos es: ");
        do {
            // aca te reordene los terminos, ojo con el orden en el que haces las cosas que afecta las operaciones.
            // Estabas primero incrementando y despues haciendo la suma, entonces empezabas desde el 2do termino
            System.out.println(num + "/" + den);
            suma += num / den;
            num = num * 2 + 1;
            den *= 2;
            x += 1;
        } while (x <= n);
        // este print con el reordenamiento ya no tiene sentido
//        System.out.println(num + "/" + den);
        System.out.println("La suma es: " + suma);
    }
}
