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

    @Override
    public double getPrice(){
        double res = .1 * memory * memory;
        switch (type){
            case phone:
                res += 10 * 1000 * 1000;
                break;
            case laptop:
                res += 30 * 1000 * 1000;
                break;
            case smartWatch:
                res += 3 * 1000 * 1000;
                break;
        }
        res += battery.getPrice();
        res += display.getPrice();
        res += 1000 * 1000 * getBatteryLife();
        return res;
    }

    public double getBatteryLife(){
        return battery.getCapacity() / (display.getResolution() * .0001);
    }
}
