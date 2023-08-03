package Observer;

public class TVReceiver implements Receiver{
    @Override
    public void receive(){
        System.out.println("Signal received by TV");
    }
}
