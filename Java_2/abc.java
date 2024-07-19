class Vehicle {
    String name;
    String tyoe;

    void brake(){
        System.out.println("Apply brakes on vehicle");
    }
    void accelerate(){
        System.out.println("Vehicle accelerated");
    }
}
class Truck extends Vehicle{
    void autoClean(){
        System.out.println("To auto clean");
    }
}
public class abc {
    public static void main(String[] args) {
        Truck tata = new Truck();
        tata.accelerate();
    }
}
