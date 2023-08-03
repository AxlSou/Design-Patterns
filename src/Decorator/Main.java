package Decorator;

public class Main {
    public static void main(String []args){
        BasicTelephone basicTelephone = new BasicTelephone();
        basicTelephone.create();

        SmartPhone smartPhone = new SmartPhone(new BasicTelephone());

        smartPhone.create();

        NextGenPhone nextGenPhone = new NextGenPhone(new SmartPhone(new BasicTelephone()));

        nextGenPhone.create();

    }
}
