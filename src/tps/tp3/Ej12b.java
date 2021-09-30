package tps.tp3;

public class Ej12b {

    public static void main(String[] args) {
        int x = 3, iter = 150;
        double sum = 1;
        double factorial = 1;
        for(int i = 1; i < iter; i++){
            factorial *= i;
            sum += Math.pow(x, i) / factorial;
        }
        System.out.println(sum);
    }
}
