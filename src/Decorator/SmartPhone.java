package Decorator;

public class SmartPhone extends TelephoneDecorator {
    public SmartPhone(Telephone telephone){
        super(telephone);
    }
    @Override
    public void create(){
        super.create();
        System.out.println("---> Tengo 4G");
    }
}
