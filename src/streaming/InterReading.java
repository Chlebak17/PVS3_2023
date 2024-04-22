package streaming;

public class InterReading {
    public static void main(String[] args) {

    }
} interface Shape{
    double calculateArea();
}class Cirlce implements Shape{
    private double radius;

    public Cirlce(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI* radius*radius;
    }
}class Rectangle implements Shape{
    private double width;
    private double lenght;

    public Rectangle(double width, double height) {
        this.width = width;
        this.lenght = height;
    }

    @Override
    public double calculateArea() {
        return width*lenght;
    }
}
