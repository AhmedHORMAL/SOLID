package openclosed.visitorusage;

public interface Part {
    String getPartNumber();

    String getDescription();

    void accept(PartVisitor v);
}
