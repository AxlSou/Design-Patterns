package Adapter;

public class PowerAdapter implements Enchufable{
    public LightBulb lightBulb = new LightBulb();

    @Override
    public void enciende(){
        lightBulb.turnOn(110);
    }

    @Override
    public void apaga(){
        lightBulb.turnOff();
    }

    @Override
    public Boolean estaEncendido(){
        return lightBulb.isPoweredOn();
    }
}
