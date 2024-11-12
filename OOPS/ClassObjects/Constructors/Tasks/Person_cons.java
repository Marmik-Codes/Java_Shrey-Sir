class Person{
    String name;
    int age;
    String address;

    Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void getPersonDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: "  + age);
        System.out.println("Address: "  + address);
    }
}

public class Person_cons {
    public static void main(String[] args) {
        Person p1 = new Person("Marmik", 20, "Gandhinagar");
        p1.getPersonDetails();
    }
    
        
}
