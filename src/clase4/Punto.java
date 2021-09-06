package clase4;

import java.util.Objects;

public class Punto {
    //atributos
    private int x;
    private int y;

    // contador de puntos
    public static int nPoints = 0;
    //constructores
    public Punto(){
        nPoints++;
    }
    public Punto(int x,int y){
        this.x=x;
        this.y=y;
        nPoints++;
    }
    public Punto(int dato){
        x=dato;
        nPoints++;
    }
    //analizadores
    public static int getnPoints(){
        return nPoints;
    }

    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }

    //modificadores
    public void setx(int x){
        this.x=x;
    }
    public void sety(int y){
        this.y=y;
    }

    public static void iguales(Punto punto1, Punto punto2){

        if(punto1.x == punto2.x && punto1.y== punto2.y){
            System.out.println("Ambos puntos son iguales");
        }
        else{
            System.out.println("Los puntos son distintos");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Punto pOther = (Punto) obj;
        if(this.x == pOther.getx() && this.y == pOther.gety()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        String palabra = "Clase4.Punto: x " + this.x + ",y " + this.y;
        return palabra;
    }


    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}