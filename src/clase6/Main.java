package clase6;

import clase4.Punto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vectorDeEnteros = new int[10];
        Punto[] vectorDePuntos = new Punto[30];

        String[] semana = new String[2];

        for(String nombreVariable : semana) {

        }
        Scanner in = new Scanner(System.in);
        int posicion;

        for(int i=0; i < semana.length; i++){
            System.out.println("Ingrese el dia");
            String dia = in.next();
            semana[i] = dia;
        }
        int min = 10;
        int max = 20;
        int numero =(int)(Math.random() * (max - min) + min);
    }
}
