package ru.example;


import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 2D Shapes
        Circle circle1 = new Circle(5.0);
        System.out.println("Circle area: " + circle1.getArea());
        System.out.println("Circle perimeter: " + circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle area: " + rectangle1.getArea());
        System.out.println("Rectangle perimeter: " + rectangle1.getPerimeter());

        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle area: " + triangle1.getArea());
        System.out.println("Triangle perimeter: " + triangle1.getPerimeter());

        // Unit conversion
        double lenInCm = 10.0;
        double lenInMeters = UnitConverter.convertToMeters(lenInCm, "cm");
        System.out.println("Length in meters: " + lenInMeters);

        // Geometry comparison
        Circle circle2 = new Circle(5.1);
        System.out.println("Circles have same area: " + GeometryComparator.isSameArea(circle1, circle2));

        // 3D Shapes
        Cube cube1 = new Cube(3.0);
        System.out.println("Cube volume: " + cube1.getVolume());
        System.out.println("Cube surface area: " + cube1.getSurfaceArea());

        Sphere sphere1 = new Sphere(4.0);
        System.out.println("Sphere volume: " + sphere1.getVolume());
        System.out.println("Sphere surface area: " + sphere1.getSurfaceArea());

    }
}