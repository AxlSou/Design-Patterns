package Observer;

public class RadioReceiver implements Receiver{
    @Override
    public void receive(){
        System.out.println("Signal received by Radio");
    }
}
