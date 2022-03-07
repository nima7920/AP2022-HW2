package items;

import users.User;

public class DigitalDevice extends Good{

    private int memory;
    private Battery battery;
    private Display display;
    private DigitalDeviceType type;

    public DigitalDevice(String name, User user, int memory, Battery battery, Display display, DigitalDeviceType type) {
        super(name, user);
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

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public DigitalDeviceType getType() {
        return type;
    }

    public void setType(DigitalDeviceType type) {
        this.type = type;
    }
}
