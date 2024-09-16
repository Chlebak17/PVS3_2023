package exception.processing;

public class ExceptionPractice {
    public static void main(String[] args) {

    }

    int factorial(int n){
        if (n == 0) {
            return 1;
        }
        return n* factorial(n-1);
    }
}
