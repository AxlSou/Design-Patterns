package Factory;

public class Main {
    public static void main(String[] args) {
        Factory price = new Factory("Spain");
        System.out.println(price.getPrice());

        Factory price2 = new Factory("United States");
        System.out.println(price2.getPrice());
    }
}
