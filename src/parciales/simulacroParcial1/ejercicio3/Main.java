package parciales.simulacroParcial1.ejercicio3;

import parciales.simulacroParcial1.ejercicio2.Autor;
import parciales.simulacroParcial1.ejercicio2.Libro;

public class Main {

    public static void main(String[] args) {
        Autor tolkien = new Autor("J. R. R. Tolkien", "tolkien@minastirith.gondor", 'M');
        System.out.println("Se creo el autor: " + tolkien.toString());
        Autor clarke = new Autor("Arthur C. Clarke", "clarke@saturn.com", 'M');
        System.out.println("Se creo el autor: " + clarke.toString());
        Libro libro1 = new Libro("Las dos Torres", tolkien, 2000, 20);
        System.out.println("Se ingreso el libro: " + libro1.toString());
        Libro libro2 = new Libro("El Retorno del Rey", tolkien, 2030, 30);
        System.out.println("Se ingreso el libro: " + libro2.toString());
        Libro libro3 = new Libro("2001: A Space Odyssey", clarke, 1500, 19);
        System.out.println("Se ingreso el libro: " + libro3.toString());

        System.out.println("La cantidad de libros distintos en la librería son: " + Libro.cantidadTotalLibros);

        System.out.println("La cantidad de libros escritos por" + tolkien + "son:" + Libro.getBooksCountByAuthor(tolkien));
        System.out.println("La cantidad de libros escritos por" + clarke + "son:" + Libro.getBooksCountByAuthor(clarke));

        System.out.println("El libro mas costoso es:" + Libro.getMostExpensiveBook());


    }
}
