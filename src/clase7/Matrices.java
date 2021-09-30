package clase7;

public class Matrices2 {


    public static void main(String[] args) {
        double[][] matrix = new double[10][10];
        double[] array = new double[10];
        double numero = matrix[1][1];
    }

    public static double[][] multiply(double[][] matriz1, double[][] matriz2) {
        // n x m - m x l
        int n = matriz1.length;
        int m = matriz2.length;
        int l = matriz2[0].length;
        double[][] res = new double[n][l];
        if (matriz1[0].length != matriz2.length) {
            return res;
        }
        for(int k = 0; k < n; k++) {
            for(int p = 0; p < l; p++){
                res[k][p] = 0;
                for(int i = 0; i < m; i++) {
                    res[k][p] += matriz1[k][i] * matriz2[i][p];
                }
            }
        }
        return res;
    }

    public static double[][] simetry(double[][] matriz){
        int n = matriz.length;
        int m = matriz[0].length;
        double[][] res = new double[m][n];
        for(int i = 0; i < n; i++) {
            for(int j =0; j <  m; j++) {
                res[j][i] = matriz[i][j];
            }
        }
        return res;
    }
}
