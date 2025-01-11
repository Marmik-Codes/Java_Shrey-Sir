abstract class Vehicle_Mfg{
    protected String type;
    protected String name;

    abstract void assemble(String mfg_plant);
    abstract void paint(double thickness);

    Vehicle_Mfg(String type,String name){
        this.name = name;
        this.type = type;
    }
}
class Car extends Vehicle_Mfg{
    double chasis_no;
    double engine_cap;
    int petrol_capacity;


    Car(double chasis_no, double engine_cap,int petrol_capacity,String name , String type){
        super(type, name);
        this.chasis_no = chasis_no;
        this.engine_cap = engine_cap;
        this.petrol_capacity = petrol_capacity;
    }
    @Override
    void assemble(String mfg_plant){
        System.out.println("Car having name " + name + " is assembling in " + mfg_plant);
    }
    @Override
    void paint(double thickness){
        System.out.println(name + " is having paint thickness of " + thickness + " mm.");
    }
    void display_details(String mfg_plant,double thickness){
        System.out.println("Vehicle Name: " + name);
        System.out.println("Vehicle Chasis no. " + chasis_no);
        System.out.println("Engine Capacity: " + engine_cap);
        System.out.println("Petrol Capacity: " + petrol_capacity);
        assemble(mfg_plant);
        paint(thickness);
    }

}
class Motorcycle extends Vehicle_Mfg{

    Motorcycle(String name , String type){
        super(type, name);
    }
    @Override
    void assemble(String mfg_plant){
        System.out.println("Motorcycle having name " + name + " is assembling in " + mfg_plant);

    }
    @Override
    void paint(double thickness){
        System.out.println(name + " is having thickness of " + thickness);

    }
    void display_details(String mfg_plant,double thickness){
        assemble(mfg_plant);
        paint(thickness);
    }
    
}

public class Vehicle {
    public static void main(String[] args) {
        Car c1 = new Car(1234, 2.0, 35, "Safari", "SUV");
        c1.display_details("Sarand ", 234);

        Motorcycle m1 = new Motorcycle("Hunter 350CC", "2-Seater");
        m1.display_details("Noida", 200);
    }
}
