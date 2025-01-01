// Task:

// Problem Statement: Car Fleet Management

// You are tasked with developing a car fleet management system. The system needs to keep track of various pieces of information for each car in the fleet, such as the brand, model, year, price, and whether the car is currently in use. Additionally, the system should maintain a count of the total number of cars in the fleet.

// Design and implement a `Car` class to represent individual cars in the fleet. The `Car` class should have the following features:

// - Attributes:
//   - `brand` (String): The brand or brand of the car.
//   - `model` (String): The model of the car.
//   - `year` (int): The manufacturing year of the car.
//   - `price` (double): The price of the car.
//   - `isRunning` (boolean): A flag indicating whether the car is currently running or not.

// - Static Attribute:
//   - `numberOfCars` (int): A static variable to keep track of the total number of cars in the fleet.

// - Methods:
//   - A constructor to initialize the car's attributes.
//   - `start()` and `stop()` methods to change the `isRunning` status.
//   - `displayCarInfo()` method to display car information.
//   - A `getNumberOfCars()` static method to retrieve the total number of cars in the fleet.

// You need to implement the `Car` class and use it to create, manage, and display information for multiple cars in the fleet. Ensure that the `numberOfCars` variable is properly incremented when new cars are added to the fleet and that it can be accessed without creating an instance of the `Car` class.

// */

import java.time.Year;

class Car{
    String brand;
    String model;
    int year;
    double price;
    boolean isRunning;
    static int numberOfCars = 0;

    Car(String brand, String model, int year,double price ){
        this.brand = brand;
        this.model =model;
        this.year  = year;
        this.price = price;
        this.isRunning = false;
        numberOfCars++;
    }
    void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Car started.");
            
        } else {
            System.out.println("Car is already running.");
        }
    }
    void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Car Stopped.");
            
        } else {
            System.out.println("Car is already running.");
        }
    }
    void displayCarInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Running Status: " + (isRunning ? "Running" : "Stopped"));
    }

}

public class Static_KW {
    public static void main(String[] args) {
        Car c1 = new Car("Tata", "Safari", 2024, 3000000);
        Car c2 = new Car("Mahindra", "Thar", 2023, 2000000);

        c1.displayCarInfo();
        c2.displayCarInfo();
        c1.start();
        c1.displayCarInfo();
        c1.start();
        c1.displayCarInfo();


        System.out.println("Total Car in fleet: " + Car.numberOfCars);

        
    }
}
