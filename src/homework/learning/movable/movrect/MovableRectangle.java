package homework.learning.movable.movrect;

import homework.learning.movable.interfacem.Movable;
import homework.learning.movable.movpoint.MovablePoint;

import javax.security.auth.callback.TextOutputCallback;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed,
                            int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void movUp() {
        topLeft.movUp();
        bottomRight.movUp();
    }

    @Override
    public void movDown() {
        topLeft.movDown();
        bottomRight.movDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
