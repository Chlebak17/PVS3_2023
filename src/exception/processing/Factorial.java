package exception.processing;

public class Factorial extends ArithmeticException{
    public Factorial(){
        super("faktoriál cisla <0 neexistuje");
    }

}
