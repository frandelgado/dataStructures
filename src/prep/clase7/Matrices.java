package clase7;

public class Matrices {

    //Las matrices son simplemente arrays bidimencionales. Se pueden pensar como un array de arrays.
    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] ret = new double[matrix1.length][matrix2[0].length];
        for(int i =0; i < matrix1.length; i ++)
            for (int j = 0;j < matrix2.length ; j++){
                for(int k =0; k < matrix1[i].length; k++) {
                    ret[i][j] += matrix1[i][k] * matrix2[k][j];
                }
        }
        return ret;
    }
}
