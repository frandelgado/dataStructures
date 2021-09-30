package parciales.parcial1.Ejercicio3;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Pepe inc.", 391818281);
        Empleado empleado1 = new Empleado("Maria", "Magdalena", 1, 300000);
        Empleado empleado2 = new Empleado("Juan", "Perez", 2, 250000);
        Empleado empleado3 = new Empleado("Valeria", "Rodriguez", 3, 200000);
        Empleado empleado4 = new Empleado("Román", "Rodriguez", 4, 100000);
        empresa.addEmpleado(empleado1);
        empresa.addEmpleado(empleado2);
        empresa.addEmpleado(empleado3);
        empresa.addEmpleado(empleado4);
        empresa.removeEmpleado(2);
        int sueldoTotal = empresa.sueldoTotal();
        System.out.println("La suma de los sueldo en la empresa son: " + sueldoTotal);
        empresa.ajustarSueldo(1.5);
        sueldoTotal = empresa.sueldoTotal();
        System.out.println("La suma de los sueldo en la empresa despues del ajuste son: " + sueldoTotal);




    }
}
