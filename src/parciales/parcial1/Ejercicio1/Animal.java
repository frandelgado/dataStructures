package parciales.parcial1.Ejercicio1;

public class Animal {

    private String clasificacion;
    private int id;
    private boolean peligrosidad;
    private String habitat;
    private boolean zoonosis;

    public Animal(){};

    public Animal(String clasificacion, int id, boolean peligrosidad, String habitat, boolean zoonosis) {
        this.clasificacion = clasificacion;
        this.id = id;
        this.peligrosidad = peligrosidad;
        this.habitat = habitat;
        this.zoonosis = zoonosis;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public int getId() {
        return id;
    }

    public boolean getPeligrosidad(){
        return peligrosidad;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean getZoonosis() {
        return zoonosis;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setPeligrosidad(boolean peligrosidad){
        this.peligrosidad = peligrosidad;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public void setZoonosis(boolean zoonosis) {
        this.zoonosis = zoonosis;
    }


    @Override
    public String toString(){
        return "Animal(clasificación: " + clasificacion + ", id:" + id + ", peligrosidad: " + peligrosidad + ", habitat: " + habitat + ", zoonosis: " + zoonosis + ")";
    }
}
