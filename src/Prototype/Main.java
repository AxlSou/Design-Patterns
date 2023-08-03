package Prototype;

public class Main {
    public static void main(String []args){
        Car car = new Car();
        car.brand = "BMW";
        car.model = "i310";
        car.engine = "Combustion";

        Car clonedCar = car.clone();

        clonedCar.brand = "Mercedes Benz";
    }
}
