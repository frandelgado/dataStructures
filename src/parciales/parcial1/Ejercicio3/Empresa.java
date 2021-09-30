package parciales.parcial11.Ejercicio3;

public class Empresa {
    //nombre, CUIT (clave numérica) y los empleados
    String nombre;
    int cuit;
    Empleado[] empleados = new Empleado[200];
    int empleadoIndex = 0;

    public Empresa(String nombre, int cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado empleado) {
        empleados[empleadoIndex] = empleado;
        empleadoIndex++;
    }

    public void removeEmpleado(int leagjo){
        for(int i =0; i< empleados.length; i++) {
            Empleado empleado = empleados[i];
            if (empleado == null) {
                continue;
            }
            if(empleado.getLegajo() == leagjo) {
                empleados[i] = null;
            }
        }
    }

    public double sueldoPromedio() {
        double total = 0;
        int cantEmpleados = 0;
        for(int i =0; i< empleados.length; i++) {
            Empleado empleado = empleados[i];
            if(empleado == null) {
                continue;
            }
            cantEmpleados++;
            total += empleado.getSalario();

        }
        return total/cantEmpleados;
    }

    public int sueldoTotal() {
        int total = 0;
        for(int i =0; i< empleados.length; i++) {
            Empleado empleado = empleados[i];
            if(empleado == null) {
                continue;
            }
            total += empleado.getSalario();

        }
        return total;
    }

    public void ajustarSueldo(double factor) {
        for(int i =0; i< empleados.length; i++) {
            Empleado empleado = empleados[i];
            if (empleado == null) {
                continue;
            }
            empleado.setSalario((int)(empleado.getSalario()*factor));
        }
    }
}
