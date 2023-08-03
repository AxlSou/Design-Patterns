package Builder;

public class CarBuilder {
    Car car;
    public CarBuilder(String brand){
        car = new Car();
        car.setBrand("Ford");
    }

    public CarBuilder setModel(String model){
        car.setModel(model);
        return this;
    }

    public CarBuilder setEngine(String engine){
        car.setModel(engine);
        return this;
    }

    public Car build(){
        return this.car;
    }
}
