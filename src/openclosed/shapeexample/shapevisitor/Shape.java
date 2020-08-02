package openclosed.shapeexample.shapevisitor;

public interface Shape {
    void draw();

    void accept(ShapeVisitor visitor);

    int getPriority();

    void setPriority(int priority);
}
