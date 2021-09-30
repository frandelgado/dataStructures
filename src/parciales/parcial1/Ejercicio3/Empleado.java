package parciales.parcial1.Ejercicio3;

public class Empleado {
    String nombre;
    String apellido;
    int legajo;
    int salario;

    public Empleado(String nombre, String apellido, int legajo, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
