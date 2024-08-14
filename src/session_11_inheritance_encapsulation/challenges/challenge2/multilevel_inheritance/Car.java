package session_11_inheritance_encapsulation.challenges.challenge2.multilevel_inheritance;

public class Car {
    private Make maker;
    private String model;
    private int year;

    private void start() {
        System.out.println("Car is running.");
    }

    private void stop() {
        System.out.println("Car has Stopped.");
    }

    private void accelerate() {
        System.out.println("Car is speeding up.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Make getMaker() {
        return maker;
    }

    public void setMaker(Make maker) {
        this.maker = maker;
    }
}

class ElectricCar extends Car {
    private long batteryCapacity;
    private long batteryRange;

    private void charge() {
        System.out.println("Car is charging.");
    }

    public long getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(long batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public long getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(long batteryRange) {
        this.batteryRange = batteryRange;
    }
}

class Tesla extends ElectricCar {
    private String auropilotVersion;

    private void enableAutopilot() {
        System.out.println("Autopilot is enabled.");
    }

    public String getAuropilotVersion() {
        return auropilotVersion;
    }

    public void setAuropilotVersion(String auropilotVersion) {
        this.auropilotVersion = auropilotVersion;
    }
}
