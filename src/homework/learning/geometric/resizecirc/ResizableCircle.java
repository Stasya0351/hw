package homework.learning.geometric.resizecirc;

import homework.learning.geometric.circ.Circle;
import homework.learning.geometric.resizable.Resizable;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        super.radius += (super.radius * percent / 100);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }
}
