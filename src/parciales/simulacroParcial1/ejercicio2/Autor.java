package parciales.simulacroParcial1.ejercicio2;

public class Autor {

    private String nombre;
    private String email;
    private char genero;

    public Autor(){}

    public Autor(String nombre, String email, char genero) {
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    public Autor(String nombre, char genero){
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }

    public char getGenero(){
        return genero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "Autor(nombre: " + nombre +
                ", email: " + email +
                ", género: " + genero +
                ")";
    }

    @Override
    public boolean equals(Object o){
        Autor other = (Autor) o;
        return other.nombre.equals(this.nombre);
    }

}
