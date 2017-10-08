package core._6OOP;

/**
 * Created by RomanR on 04-Jun-14.
 */
public class App00 {
    public static void main(String[] args) {
        vehicleGoes(new Car());
        vehicleGoes(new Tractor());
        vehicleGoes(new Vehicle() {
            @Override
            void go() {
                super.go();
            }
        });

    }

    static void vehicleGoes (Vehicle vehicle){
        vehicle.go();
    }
}

abstract class Vehicle {
    void go() {
        System.out.println("go like Vehicle");
    };
}

class Car extends Vehicle{

    @Override
    void go() {
        System.out.println("go like Car");
    }
}

class Tractor extends Vehicle{
    @Override
    void go() {
        System.out.println("go like Tractor");
    }
}