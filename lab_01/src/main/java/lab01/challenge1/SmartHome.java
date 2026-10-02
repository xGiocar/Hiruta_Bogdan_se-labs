package lab01.challenge1;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {

    /*
        Encapsulation - Device, Light, Thermostat, SecurityCamera
        Abstraction - Device
        Inheritance - Light, Thermostat, SecurityCamea
        Polymorphism - powerUsage method
    */


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

    public static void run() {
        SmartHome home = new SmartHome();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SecurityCamera camera = new SecurityCamera();

        home.addDevice(light);
        home.addDevice(thermostat);
        home.addDevice(camera);

        home.printStatus();
        System.out.println("Total power: " + home.totalPowerUsage());
        home.turnEverythingOff();
        home.printStatus();

        try {
            light.setBrightness(150);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }
}
