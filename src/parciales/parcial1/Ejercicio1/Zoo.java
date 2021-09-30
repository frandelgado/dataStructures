package parciales.parcial11.Ejercicio1;

public class Zoo {

    private String nombre;
    private String direccion;
    private Animal[] animales = new Animal[200];

    public Zoo() {}

    public Zoo(String nombre, String direccion, Animal[] animales) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.animales = animales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }
    public Animal[] getAnimales() {
        return animales;
    }

    public void setNombre(String  nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    @Override
    public String toString(){
        return "Zoo(nombre: " + nombre + ", dirección: " + direccion + ")";
    }

    public int animalesPorHabitat(String habitat){
        int cantidad = 0;
        for(int i = 0; i < animales.length; i++){
            Animal animal = animales[i];
            if(animal == null){
                break;
            }
            if(animal.getHabitat().equals(habitat)){
                cantidad++;
            }
        }
        System.out.println("La cantidad de animales en el zoo " + nombre + " para el habitat " + habitat + "son: " + cantidad);
        return cantidad;
    }

    public static double vida(Zoo zoo) {
        double cantidad = 0;
        double enfermos = 0;
        Animal[] animales = zoo.getAnimales();
        for(int i = 0; i < animales.length; i++) {
            Animal animal = animales[i];
            if (animal == null) {
                break;
            }
            if(animal.getZoonosis()){
                enfermos++;
            }
            cantidad++;
        }
        return enfermos/cantidad;
    }

    public Boolean esta(int id){
        for(int i = 0; i < animales.length; i++) {
            Animal animal = animales[i];
            if (animal == null) {
                break;
            }
            if(animal.getId() == id){
                System.out.println("La peligrosidad del animal es: " + animal.getPeligrosidad());
                return animal.getPeligrosidad();
            }
        }
        return null;
    }
}
