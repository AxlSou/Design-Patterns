package Prototype;

public class Car implements Cloneable{
    public String brand;
    public String model;
    public String engine;

    public Car(){}

//    public Car clone(){
//        Car car = new Car();
//
//        car.brand = this.brand;
//        car.model = this.model;
//        car.engine = this.engine;
//
//        return car;
//    }

    public Car clone(){
        return this.clone();
    }
}
