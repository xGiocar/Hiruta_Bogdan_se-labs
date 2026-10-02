package lab01.challenge1;

public class Thermostat extends Device {
    private double temperature;
    private static final double POWER_CONSUMPTION = 50;
    private static final int MAX_TEMPERATURE = 28;
    private static final int MIN_TEMPERATURE = 16;

    public Thermostat() {
        super("Thermostat", true);
        this.temperature = MIN_TEMPERATURE;
    }

    @Override
    public double powerUsage() {
        return POWER_CONSUMPTION;
    }

    @Override
    public String status() {
        return this.getState() ? "On" : "Off";
    }

    public void setTemperature(double temperature) {
        if (temperature < MIN_TEMPERATURE ||
            temperature > MAX_TEMPERATURE) {
            throw new IllegalArgumentException("Invalid temperature value");
        }
    }

    public double getTemperature() {
        return  this.temperature;
    }
}
