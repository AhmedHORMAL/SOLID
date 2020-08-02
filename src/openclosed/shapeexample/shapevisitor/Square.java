package openclosed.shapeexample.shapevisitor;

public class Square implements Shape {
    private int priority;

    @Override
    public void draw() {

    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }
}
