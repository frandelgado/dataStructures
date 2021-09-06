package clase4;

public class Segment {

    private Punto p1;
    private Punto p2;

    public Segment() {
    }

    public Segment(Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto getP1(){
        return p1;
    }

    public Punto getP2(){
        return p2;
    }

    public void setP1(Punto p1){
        this.p1 = p1;
    }

    public void setP1(int x1, int y1) {
        p1 = new Punto(x1, y1);
    }

    public void setP2(Punto p2){
        this.p2 = p2;
    }
}
