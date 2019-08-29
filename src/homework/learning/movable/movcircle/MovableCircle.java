package homework.learning.movable.movcircle;

import homework.learning.movable.interfacem.Movable;
import homework.learning.movable.movpoint.MovablePoint;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void movUp() {
        center.movUp();
    }

    @Override
    public void movDown() {
        center.movDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
