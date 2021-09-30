package parciales.parcial11;

import parciales.parcial11.Ejercicio1.Animal;
import parciales.parcial11.Ejercicio1.Zoo;

import java.util.Scanner;

public class Ejercicio2 {

    private static Zoo[] zoos;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nZoos = 0;
        do {
            System.out.println("Ingrese la cantidad total de zoologicos: ");
            nZoos = in.nextInt();
        } while(nZoos > 50 || nZoos < 1);

        zoos = new Zoo[nZoos];

        for(int i=0; i < zoos.length; i++){
            zoos[i] = leerZoo(in);
        }
    }

    private static Zoo leerZoo(Scanner in){

        System.out.println("Ingrese el nombre del zoo: ");
        String nombre = in.next();
        System.out.println("Ingrese la dirección del zoo: ");
        String direccion = in.next();
        int cantidadAnimales = 0;
        do {
            System.out.println("Ingrese la cantidad total de animales en el zoologico");
            cantidadAnimales = in.nextInt();
        } while(cantidadAnimales > 200 || cantidadAnimales < 1);
        Animal[] animales = new Animal[cantidadAnimales];
        for(int i = 0; i< animales.length; i++) {
            animales[i] = leerAnimal(in);
        }
        Zoo zoo = new Zoo(nombre, direccion, animales);
        return zoo;
    }

    private static Animal leerAnimal(Scanner in) {

        System.out.println("Ingrese la clasificación del animal: ");
        String clasificacion = in.next();
        System.out.println("Ingrese el id: ");
        int id = in.nextInt();
        System.out.println("Ingrese la peligrosidad: ");
        boolean peligrosidad = in.nextBoolean();
        System.out.println("Ingrese el habitat: ");
        String habitat = in.next();
        System.out.println("Ingrese la zoonosis: ");
        boolean zoonosis = in.nextBoolean();

        return new Animal(clasificacion, id, peligrosidad, habitat, zoonosis);
    }

    public int cantidadParaHabitat(String habitat) {
        int cantidad = 0;
        for(int i = 0; i < zoos.length; i++) {
            Zoo zoo = zoos[i];
            if(zoo == null){
                break;
            }
            cantidad += zoo.animalesPorHabitat(habitat);
        }
        System.out.println("La cantidad total de animales en todos los zoos para el habitat " + habitat + " es: " + cantidad);
        return cantidad;
    }

    public void promedioEnfermosPorZoo(){
        for(int i = 0; i < zoos.length; i++) {
            Zoo zoo = zoos[i];
            if (zoo == null) {
                break;
            }
            double proporcion = Zoo.vida(zoo);
            System.out.println("La proporción de animales enfermos en el zoo " + zoo + " es: " + proporcion);
        }
    }

    public Boolean esPeligroso(String nombreZoo, int idAnimal) {
        Boolean peligrosidad = null;
        for(int i = 0; i < zoos.length; i++) {
            Zoo zoo = zoos[i];
            if (zoo == null) {
                break;
            }
            if(zoo.getNombre().equals(nombreZoo)) {
                peligrosidad = zoo.esta(idAnimal);
            }
        }
        return peligrosidad;
    }


}
