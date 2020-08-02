package openclosed.shapeexample.shapevisitor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DrawerTest {
    private ShapeVisitor shapeVisitor;
    private Circle circle;
    private Square square;

    private Drawer drawer;

    @Before
    public void init() {
        shapeVisitor = new DrawerShapeConfigurator();
        circle = new Circle();
        square = new Square();
        circle = new Circle();
        square = new Square();
        circle.accept(shapeVisitor);
        square.accept(shapeVisitor);
        drawer = new Drawer();
    }

    @Test
    public void testDrawAllShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(circle);
        shapes.add(circle);
        shapes.add(square);
        List<Shape> drawnShapes = drawer.drawAllShapes(shapes);
        Assert.assertEquals(circle, drawnShapes.get(0));
        Assert.assertEquals(circle, drawnShapes.get(1));
        Assert.assertEquals(square, drawnShapes.get(2));
        Assert.assertEquals(square, drawnShapes.get(3));
    }
}