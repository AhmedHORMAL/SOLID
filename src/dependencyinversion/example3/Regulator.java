package dependencyinversion.example3;

public interface Regulator {

    default void regulate(Thermometer t, Heater h,
                          double minTemp, double maxTemp)
    {
        for(;;)
        {
            while (t.read() > minTemp) {
                try {
                    wait(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            h.engage();
            while (t.read() < maxTemp) {
                try {
                    wait(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            h.disengage();
        }
    }
}
