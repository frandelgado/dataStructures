package prep.clase7;

public class Recursion {

    // La recursión se basa en definir un problema en terminos de una versión mas simple del mismo.
    // Por ejemplo: Buscar el camino a casa se peude traducir en:
    // Si estas en casa, deja de moverte
    // Camina un paso hacia tu casa
    // Busca tu camino a casa
    //
    // Tenemos tres partes:
    // - Caso base (cuando frenamos)
    // - Ejecutamos un paso hacia el caso base
    // - LLamada recursiva (nos llamamos a nosotros mismos)
    // credit: https://www.cs.utah.edu/~germain/PPS/Topics/recursion.html

    /**
     * El número de fibonacci se define como
     * F(0) = 0
     * F(1) = 1
     * F(N) = F(N-1) + F(N-2)
     * @param number the number to start the fibonacci sequence
     * @return the actual result of the fibonacci sequence
     */
    public int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number-2);
    }


    public int factorial(int n)
    {
        return n * factorial(n - 1);
    }

    /**
     * Dado un N, retornar N + N-1 + N-2 ...
     */
    public int sumarTodosLosNúmeros(int n) {
        if(n == 0){
            return 0;
        }
        return n + sumarTodosLosNúmeros(n-1);
    }

    public static boolean checkearPalindromo(String s){
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)) {
            return checkearPalindromo(s.substring(1, s.length()-1));
        }
        return false;
    }

}