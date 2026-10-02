package lab01.challenge1;

public class Light extends Device{
    private int brightness;
    private static final int MIN_BRIGHTNESS = 0;
    private static final int MAX_BRIGHTNESS = 100;
    private static final double POWER_CONSUMPTION = 0.1f;

    public Light() {
        super();
    }

    @Override
    public double powerUsage() {
        return brightness * POWER_CONSUMPTION;
    }

    @Override
    public String status() {
        return this.getState() ? "On" : "Off";
    }

    public int getBrightness() {
        return this.brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness < MIN_BRIGHTNESS ||
            brightness > MAX_BRIGHTNESS) {
            throw new IllegalArgumentException("Invalid brightness value");
        }

        else {
            this.brightness = brightness;
        }
    }
}
