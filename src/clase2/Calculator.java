package clase2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(
                "Las operaciónes disponibles son: \n" +
                        "1. Sumar\n" +
                        "2. Restar\n" +
                        "3. Multiplicar\n" +
                        "4. Divir\n" +
                        "5. Salir\n"
        );

        int option;
        do {
            // Eligo la opción entre: Sumar, Restar, multiplicar, dividir y salir
            option = in.nextInt();

            int num1, num2;
            switch (option) {
                // Tengo que sumar
                case 1:
                    System.out.println("Ingrese los dos números que quiere sumar");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    int suma = num1 + num2;
                    System.out.printf("La suma de los números es %d\n", suma);
                    break;

                // Tengo que restar
                case 2:
                    System.out.println("Ingrese los dos números que quiere restar");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    int resta = num1 - num2;
                    System.out.printf("La resta de los números es %d\n", resta);
                    break;

                // Tengo que multiplicar
                case 3:
                    System.out.println("Ingrese los dos números que quiere sumar");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    int mult = num1 * num2;
                    System.out.printf("La suma de los números es %d\n", mult);
                    break;

                // Tengo que divir
                case 4:
                    System.out.println("Ingrese los dos números que quiere sumar");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    int div = num1 / num2;
                    System.out.printf("La suma de los números es %d\n", div);
                    break;
                case 5:
                    // imprimo un emojii y chau
                    System.out.println("\uD83D\uDC4B Chau!");
                    break;

                default:
                    System.out.printf("la opción %d no es válida, debe ser alguna de las del menú \n", option);
            }

        } while(option != 5);

    }
}
