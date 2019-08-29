package homework.learning.shapes.rectangle;

import homework.learning.shapes.shape.Shape;

public class Rectangle extends Shape {
    private double length = 1.0f;
    private double width = 1.0f;

    public Rectangle(){}
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getArea(){
        double area = width * length;
        return area;
    }
    public double getPerimeter(){
        double perim = (width + length) * 2;
        return perim;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
