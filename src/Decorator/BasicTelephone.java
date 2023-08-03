package Decorator;

public class BasicTelephone implements Telephone{

    @Override
    public void create(){
        System.out.println("I'm a basic telephone");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){
        System.out.println("---> Tengo GSM");
    }

    private void tengoSMS(){
        System.out.println("---> Tengo SMS");
    }
}
