package openclosed.visitorusage;

public interface PartVisitor
{
    void visit(PiecePart p);
    void visit(Assembly a);
}