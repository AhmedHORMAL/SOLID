package interfacesegregation.inelegantadapter;

public class DoorTimerAdapter implements TimerClient {
    private TimedDoor timedDoor;

    public DoorTimerAdapter(TimedDoor theDoor) {
        timedDoor = theDoor;
    }

    @Override
    public void timeOut(int timeOutId) {
        timedDoor.doorTimeOut(timeOutId);
    }
}
