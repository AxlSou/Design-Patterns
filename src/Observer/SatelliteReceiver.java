package Observer;

public class SatelliteReceiver implements Receiver{
    @Override
    public void receive(){
        System.out.println("Signal received by Satellite");
    }
}
