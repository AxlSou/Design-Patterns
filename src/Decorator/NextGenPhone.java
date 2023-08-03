package Decorator;

public class NextGenPhone extends TelephoneDecorator{
    public NextGenPhone(Telephone telephone){
        super(telephone);
    }

    @Override
    public void create(){
        super.create();
        System.out.println("----> NextGenPhone created");
    }
}
