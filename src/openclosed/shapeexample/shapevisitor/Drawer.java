package openclosed.shapeexample.shapevisitor;

import java.util.List;

public class Drawer {

    public List<Shape> drawAllShapes(List<Shape> shapes) {
        shapes.sort(new ShapeComparator());
        for (Shape shape : shapes)
            shape.draw();
        return shapes;
    }
}
