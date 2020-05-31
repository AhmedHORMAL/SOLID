package liskovsubstitution.example1;

public class UnboundSet implements Set {
    @Override
    public void add(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public boolean isMember(Object o) {
        return false;
    }
}
