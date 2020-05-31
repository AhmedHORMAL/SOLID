package dependencyinversion.example2;

public class Button {
    private boolean condition;
    private SwitchableDevice switchableDevice;

    public Button(SwitchableDevice switchableDevice) {
        this.switchableDevice = switchableDevice;
    }

    public void poll() {
        if(condition) {
            switchableDevice.turnOn();
        } else {
            switchableDevice.turnOf();
        }
    }
}
