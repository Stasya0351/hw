package homework.learning.shapes.circle;

import homework.learning.shapes.shape.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double sqr = Math.PI*radius*radius;
        return sqr;
    }

    public double getPerimeter(){
        double perim = 2*Math.PI*radius;
        return perim;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Circle{radius=" + radius +
                '}';
    }
}
