package items;

public class DigitalDevice extends Good{

    private int memory;
    private Battery battery;
    private Display display;
    private DigitalDeviceType type;

    public DigitalDevice(String name, long userID, int memory, Battery battery, Display display, DigitalDeviceType type) {
        super(name, userID);
        this.memory = memory;
        this.battery = battery;
        this.display = display;
        this.type = type;
    }
}
