package lab01.challenge1;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    List<Device> devices;

    public SmartHome() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        this.devices.add(device);
    }

    public double totalPowerUsage() {
        double totalPower = 0;
        for (Device d : devices) {
            totalPower += d.powerUsage();
        }

        return totalPower;
    }

    public void turnEverythingOff() {
        for (Device d : devices) {
            d.setState(false);
        }
    }

    public void printStatus() {
        for (Device d : devices) {
            StringBuilder sb = new StringBuilder();
            sb.append(d.getName());
            sb.append(": ");
            sb.append(d.status());

            System.out.println(sb.toString());
        }
    }
}
