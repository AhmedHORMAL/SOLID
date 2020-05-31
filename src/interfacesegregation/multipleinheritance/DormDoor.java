package interfacesegregation.multipleinheritance;

public class DormDoor implements TimedDoor {
    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }

    @Override
    public boolean IsDoorOpen() {
        return false;
    }

    @Override
    public void timeOut(int timeOutId) {

    }
}
