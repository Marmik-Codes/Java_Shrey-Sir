class Vehicle{
    String brand;
    int wheels;

    Vehicle(){

    }
    Vehicle(String brand , int wheels){
        this.brand = brand;
        this.wheels = wheels;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + wheels);
    }
}

class Car extends Vehicle{
    
    int doors;

    Car(String brand , int wheels , int doors){
        this.brand = brand; 
        this.wheels = wheels;
        this.doors = doors;
    }
    void displayCarInfo() {
        displayInfo(); 
        System.out.println("Number of Doors: " + doors);
    }
}

class Motorcycle extends Vehicle{
    boolean LikeSakharam;

    Motorcycle(String brand, int wheels, boolean LikeSakharam) {
        this.brand = brand; 
        this.wheels = wheels;
        this.LikeSakharam = LikeSakharam;
    }
    void displayMotorcycleInfo() {
        displayInfo(); // Call base class method
        System.out.println("Has Sidecar: " + (LikeSakharam ? "Yes" : "No"));
    }
}

public class Vehicle_Single {
    public static void main(String[] args) {
        Car c1 = new Car("Range Rover", 5, 5);
        System.out.println("Car Info");
        c1.displayCarInfo();

        Motorcycle m1 = new Motorcycle("Royal Enfield", 2, true);
        System.out.println("Motorcycle Info");
        m1.displayMotorcycleInfo();
    }
}
