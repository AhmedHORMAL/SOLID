package openclosed.shapeexample.shapevisitor;

public interface ShapeVisitor {
    void visit(Circle circle);

    void visit (Square square);
}
