package Adapter;

public class LightBulb {
    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage){
        poweredOn = true;
        this.voltage = voltage;

        System.out.println("Lightbulb powered on with " + voltage + " of current");
    }

    public void turnOff(){
        poweredOn = false;
        voltage = 0;
        System.out.println("Lightbulb powered off with " + voltage + " of current");

    }

    public boolean isPoweredOn(){
        return poweredOn;
    }
}
