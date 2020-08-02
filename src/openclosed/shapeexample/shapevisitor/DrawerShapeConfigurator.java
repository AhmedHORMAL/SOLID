package openclosed.shapeexample.shapevisitor;

public class DrawerShapeConfigurator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        circle.setPriority(1);
    }

    @Override
    public void visit(Square square) {
        square.setPriority(2);
    }
}
