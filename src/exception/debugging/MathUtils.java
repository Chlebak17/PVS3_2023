package exception.debugging;

public class MathUtils {

    public double getAverage(int[] numbers){
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }

        return (double) (sum/ numbers.length);
    }


}
