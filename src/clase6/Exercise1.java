package clase6;

public class Exercise1 {

    // Dado un vector con números, devolver la posición del elemento mas grande.
    public static void main(String[] args) {
        int numbers[] = {1, 4, 6, 23, 23, 2};
        int maxIndex = getMaxIndex(numbers);
        System.out.println(maxIndex);

    }

    public static int getMaxIndex(int[] numbers){
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int current;
        for(int i = 0; i < numbers.length; i++){
            current = numbers[i];
            if(max < current){
                max = current;
                maxIndex=i;
            }
        }
        return maxIndex;
    }


}
