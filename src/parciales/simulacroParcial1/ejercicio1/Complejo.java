package parciales.simulacroParcial1.ejercicio1;

public class Complejo {

    private double a;
    private double b;

    public Complejo() {
    }

    public Complejo(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public boolean isReal(){
        return b == 0;
    }

    public double magnitud(){
        return Math.sqrt((a*a) + (b*b));
    }

    public static Complejo suma(Complejo c1, Complejo c2) {
        double a = c1.a + c2.a;
        double b = c1.b + c2.b;
        return new Complejo(a, b);
    }

    @Override
    public String toString(){
        return "Complejo(" + a + " + " + b + "i)";
    }
}
