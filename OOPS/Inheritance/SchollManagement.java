class Person{
    String name;
    int age;
    String mobile_no;
    String address;
    Person(){

    }

    Person(String name,int age,String mobile_no,String address){
        this.name = name;
        this.age = age;
        this.mobile_no = mobile_no;
        this.address = address;
    }
    void displayPerson_info(){
        System.out.println("Name:: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mobile_NO: " + mobile_no);
        System.out.println("Address: " + address);
    }
}

class Student extends Person{
    boolean Studying ;
    int Std;
    int Roll_num;

    Student(){

    }
    Student(String name,int age,String mobile_no,String address,int Std , int Roll_num , boolean Studying){
        this.name = name;
        this.age = age;
        this.mobile_no = mobile_no;
        this.address = address;
        this.Std = Std;
        this.Roll_num = Roll_num;
        this.Studying = Studying;
    }

    void display_Student_info(){
        displayPerson_info();
        System.out.println("Std: " + Std);
        System.out.println("Roll Number: " + Roll_num);
        System.out.println("Studying: " + (Studying ? "YES" : "NO") );
    }

}

class  Teacher extends Student{
    String Degree = "";

    Teacher(String name,int age,String mobile_no,String address,int Std , int Roll_num , boolean Studying,String Degree){
        this.name = name;
        this.age = age;
        this.mobile_no = mobile_no;
        this.address = address;
        this.Std = Std;
        this.Roll_num = Roll_num;
        this.Studying = Studying;
        this.Degree = Degree;
    }

    void display_teacher_info(){
        display_Student_info();
        System.out.println("Degree: " + Degree);
    
    }
}



public class SchollManagement {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Shrey Sir", 22, "9824781379", "Mansa", 12, 25, true,"yes");

        t1.display_teacher_info();
    }
}
