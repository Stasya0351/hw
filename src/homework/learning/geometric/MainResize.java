package homework.learning.geometric;

import homework.learning.geometric.resizecirc.ResizableCircle;

public class MainResize {
    public static void main(String[] args) {
        //task8
        ResizableCircle circ = new ResizableCircle(100);
        circ.resize(10);
        System.out.println(circ);
        System.out.println(circ.getArea());
        System.out.println(circ.getPerimeter());

    }
}
