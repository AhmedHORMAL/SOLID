package openclosed.shapeexample.shapevisitor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeVisitorTest {
    private ShapeVisitor shapeVisitor;
    private Circle circle;
    private Square square;

    @Before
    public void init() {
        shapeVisitor = new DrawerShapeConfigurator();
        circle = new Circle();
        square = new Square();
    }

    @Test
    public void testCircleForDrawer(){
        circle.accept(shapeVisitor);
        Assert.assertEquals(1, circle.getPriority());
    }

    @Test
    public void testSquareForDrawer(){
        square.accept(shapeVisitor);
        Assert.assertEquals(2, square.getPriority());
    }
}
