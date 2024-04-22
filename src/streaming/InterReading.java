package streaming;

import java.util.Arrays;
import java.util.List;

public class InterReading {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Cirlce(4.5),
                new Rectangle(9.0,8.5),
                new Rectangle(3.33,40),
                new Cirlce(6.45),
                new Rectangle(9.7,4.45)
        );
        //součet obsahů
        double totalArea = shapes.stream()
                .mapToDouble(Shape::calculateArea)
                .sum();
        System.out.println("Součet obsahů: " + totalArea);

        //tvary větší než 80
        List<Shape> bigShapes = shapes.stream()
                .filter(shape -> shape.calculateArea() > 80)
                .toList();

        System.out.println("Počet největších tvarů: " + bigShapes.size());

        Shape largestShape = shapes.stream()
                .max((s1,s2) -> ((int) s1.calculateArea() - (int) s2.calculateArea()))
                .orElse(null);
        System.out.println("Largest shape " + largestShape);

        //prumerny obsah
        double averageArea = shapes.stream().
                mapToDouble(Shape::calculateArea)
                .average()
                .orElse(0);
        System.out.println("Průměrný obsah: " + averageArea);

        int amountOfSmallShapes = (int) shapes.stream()
                .filter(shape -> shape.calculateArea() < 100)
                .count();
        System.out.println("Počet malých tvarů: " + amountOfSmallShapes);
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

    @Override
    public String toString() {
        return "Rectangle(w:" + width + " l:"+ lenght+ ")";
    }
}
