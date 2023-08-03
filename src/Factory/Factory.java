package Factory;

import java.util.ArrayList;
import java.util.Arrays;

public class Factory {
    Price price;
    private Factory() {}
    private ArrayList<String> countries = new ArrayList<>(
            Arrays.asList("Spain", "France", "Ireland", "Portugal", "Germany")
    );
    public Factory(String country){
        if (countries.contains(country)){
            System.out.println("EUR price");
            this.price = new EUR();
        } else {
            System.out.println("USD Price");
            this.price = new USD();
        }
    }

    public double getPrice(){
        return price.getPrice();
    }
}
