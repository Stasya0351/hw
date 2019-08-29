package homework.learning.geometric.circ;

import homework.learning.geometric.geometricobj.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perim = 2*Math.PI*radius;
        return perim;
    }

    @Override
    public double getArea() {
        double sqr = Math.PI*radius*radius;
        return sqr;
    }
}
