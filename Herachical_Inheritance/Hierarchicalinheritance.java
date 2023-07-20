package Herachical_Inheritance;

public class Hierarchicalinheritance {
	class Vehicle {
        void showVehicle() {
            System.out.println("This is a vehicle.");
        }
    }

  
    class Motorcycle extends Vehicle {
        void showMotorcycle() {
            showVehicle();
            System.out.println("This is a motorcycle.");
        }
    }

    
    class Car extends Vehicle {
        void showCar() {
            showVehicle();
            System.out.println("This is a car.");
        }
    }

    public static void main(String[] args) {
    	Hierarchicalinheritance instance = new Hierarchicalinheritance();

        Motorcycle bike = instance.new Motorcycle();
        bike.showMotorcycle();

        Car car = instance.new Car();
        car.showCar();
    }

}
