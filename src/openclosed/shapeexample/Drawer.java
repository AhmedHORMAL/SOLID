package openclosed.shapeexample;

import java.util.List;

public class Drawer {

    public void drawAllShapes(List<Shape> shapes) {
        shapes.sort(new ShapeComparer());
        for (Shape shape : shapes)
            shape.draw();
    }
}
