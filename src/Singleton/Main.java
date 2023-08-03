package Singleton;

public class Main {
    public static void main(String []args){
        Singleton singleton = Singleton.getInstance(); // new Singleton
        Singleton singleton1 = Singleton.getInstance(); // singleton1 = singleton

        singleton.setCounter(15);
        singleton1.setCounter(10);

        System.out.println(singleton.getCounter());
        System.out.println(singleton);
        System.out.println(singleton1.getCounter());
        System.out.println(singleton1);
    }
}
