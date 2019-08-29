package homework.learning.shapes.square;

import homework.learning.shapes.rectangle.Rectangle;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }
    @Override
    public void setLength(double side){
       setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() + "}";
    }
}
