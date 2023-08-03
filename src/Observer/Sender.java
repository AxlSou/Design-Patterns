package Observer;

import java.util.ArrayList;

public class Sender {
    private ArrayList<Receiver> receivers = new ArrayList<>();

    public void addReceiver(Receiver receiver){
        this.receivers.add(receiver);
    }

    public void send(){
        for (Receiver receiver : receivers){
            receiver.receive();
        }
    }
}
