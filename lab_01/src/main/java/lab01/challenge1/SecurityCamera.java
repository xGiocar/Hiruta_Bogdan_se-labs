package lab01.challenge1;

public class SecurityCamera extends Device{
    private boolean recording;
    private static final double RECORDING_CONSUMPTION = 8;
    private static final double IDLE_CONSUMPTION = 5;

    public SecurityCamera() {
        super("Security Camera", true);
        recording = false;
    }

    @Override
    public double powerUsage() {
        return recording ? RECORDING_CONSUMPTION : IDLE_CONSUMPTION;
    }

    @Override
    public String status() {
        return this.getState() ? "On" : "Off";
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    public boolean getRecording(){
        return recording;
    }
}
