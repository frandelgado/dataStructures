package tps.tp3;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, x = 1, i, terminos;

        // los calculos van a ser con números grandes, usa double mejor.
        double factorial = 1;
        double cuenta, suma = 1;
        do {
            System.out.println("Ingrese un número entero positivo: ");
            num = in.nextInt();
        }while(num<0);
//        te falto pedirle al usuario el número de terminos
        do {
            System.out.println("Ingrese el número de terminos: ");
            terminos = in.nextInt();
        }while(num<0);
        if (num == 0) {
            System.out.println("El resultado es: "+num);
        }else {
//            inicializo la serie en 1
//             aca se ejecuta el while para la cantidad determinada de térmonios. Cada iteración del loop calcula un termino y lo suma
            while(terminos > x) {
//                te confundiste en como calcular la potencia en java.
//                cuenta = num*x;
                cuenta = Math.pow(num, x);
//                Fijate aca, podes o reiniciar el factorial cada vez que entras en el while (factorial = 1),
//                o calcularlo en base al factorial de la iteración anterior ( que es más eficiente)
//                for(i=1; i<=x; i++) {
//                    factorial = factorial*i;
//                }
                factorial = factorial*x;
                suma += cuenta/factorial;
                x+=1;
//              cuidado que aca le estas sumando 1 en cada iteración del loop (que equivale a un termino de la sucesión),
//              no es lo que define la sumatoria.
//                ex += 1+x;
                // este print va cuando terminas de calcular la serie, a menos que quieras imprimir cada termino o algo así.
//                System.out.println("e^x = "+x);

            }
            System.out.println("e^x = " + suma);
        }

    }

}
