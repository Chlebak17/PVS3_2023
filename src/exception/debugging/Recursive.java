package exception.debugging;

public class Recursive {

    public static void main(String[] args) {
        int number = 5;
        int result = recursiveDivide(number);
        System.out.println(result);
    }

    public static int recursiveDivide(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 100 / n;
        } else {
            return 100 / recursiveDivide(n - 2);
        }
    }
}