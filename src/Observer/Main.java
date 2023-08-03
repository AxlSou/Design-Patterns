package Observer;

public class Main {
    public static void main(String []args){
        Sender sender = new Sender();

        TVReceiver tv = new TVReceiver();
        RadioReceiver radio = new RadioReceiver();
        SatelliteReceiver satellite = new SatelliteReceiver();

        sender.addReceiver(radio);
        sender.addReceiver(tv);
        sender.addReceiver(satellite);

        sender.send();
    }
}
