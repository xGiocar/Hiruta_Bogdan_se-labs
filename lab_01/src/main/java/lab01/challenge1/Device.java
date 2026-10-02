package lab01.challenge1;

public abstract class Device {
    private String name;
    private boolean state;

    public void turnOn() {
        state = true;
    }
    public void turnOff() {
        state = false;
    }

    public String getName() {
        return name;
    }
    public boolean getState() {
        return state;
    }
    public void setState(boolean state) {this.state = state;}


    public abstract double powerUsage();
    public abstract String status();
}
