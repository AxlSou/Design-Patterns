package Adapter;

public class Horno implements Enchufable{
    boolean encendido = false;

    public void enciende(){
        encendido = true;
        System.out.println("Horno encendida");
    }

    public void apaga(){
        encendido = false;
        System.out.println("Horno apagada");

    }

    public Boolean estaEncendido(){
        return encendido;
    }
}
