package Decorator;

public class TelephoneDecorator implements Telephone{
    private Telephone telephone;

    public TelephoneDecorator(Telephone telephone){
        this.telephone = telephone;
    }
    @Override
    public void create(){
        this.telephone.create();
    }
}
