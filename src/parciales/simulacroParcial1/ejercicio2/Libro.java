package simulacroParcial1.ejercicio2;

public class Libro {

    public static int cantidadTotalLibros;

    private String nombre;
    private Autor autor;
    private double precio;
    private int cantidadEjemplares;

    public static Libro[] libros = new Libro[100];

    public Libro(){
        Libro.libros[Libro.cantidadTotalLibros++] = this;
    }

    public Libro(String nombre, Autor autor, double precio, int cantidadEjemplares){
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantidadEjemplares = cantidadEjemplares;
        Libro.libros[Libro.cantidadTotalLibros++] = this;
    }

    public Libro(String nombre){
        this.nombre = nombre;
        Libro.libros[Libro.cantidadTotalLibros++] = this;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Autor getAutor(){
        return this.autor;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "Libro(nombre: " + nombre + " ,autor: " + autor + " ,precio: " + precio + " ,cantidadEjemplares: " + cantidadEjemplares + ")";
    }

    public static int getBooksCountByAuthor(Autor autor) {
        int cantidad = 0;
        for(int i=0; i<cantidadTotalLibros; i++){
            Libro libro = Libro.libros[i];
            if(libro.getAutor().equals(autor)){
                cantidad++;
            }
        }
        return cantidad;
    }

    public static Libro getMostExpensiveBook(){
        Libro mostExpensive = Libro.libros[0];
        for(int i=0; i<cantidadTotalLibros; i++){
            Libro current = Libro.libros[i];
            if( mostExpensive.precio < current.precio) {
                mostExpensive = current;
            }
        }
        return mostExpensive;
    }
}
