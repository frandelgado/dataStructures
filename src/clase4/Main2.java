package clase4;

import clase4.Punto;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        int x,y;
        System.out.println("Ingresa dos numeros enteros: ");
        x= entrada.nextInt();
        y= entrada.nextInt();
        Punto puntoUno;
        puntoUno= new Punto(x,y);
        System.out.println(puntoUno);
        System.out.println("x "+puntoUno.getx());
        System.out.println("y "+puntoUno.gety());
        Punto puntoDos;
        puntoDos= new Punto(25,y);
        puntoDos.sety( y= entrada.nextInt());
        System.out.println("x "+puntoDos.getx());
        System.out.println("y "+puntoDos.gety());
        Punto.iguales(puntoUno, puntoDos);
        Punto puntoTres;
        puntoTres= new Punto(45);
        System.out.println("x "+puntoTres.getx());
        System.out.println("y "+puntoTres.gety());
    }
}