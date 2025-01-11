abstract class Animal{
    protected String name;
    protected String type;

    abstract void eat();
    abstract void sound();

    Animal(String name, String type){
        this.type = type;
        this.name = name;
    }
}
class cat extends Animal{
    

    cat(String name , String type){
        super(name, type);
        
    }
    @Override
    void eat(){
        System.out.println(name + " is Eating Fish." );
    }
    @Override
    void sound(){
        System.out.println(name + " is Meowing.");
    }
    void display(){
        eat();
        sound();
    }
}
class dog extends Animal{
    

    dog(String name , String type){
        super(name, type);
        
    }
    @Override
    void eat(){
        System.out.println(name + " is leaking Bone." );
    }
    void sound(){
        System.out.println(name + " is Barking.");
    }
    void display(){
        eat();
        sound();
    }
}

public class AnimalAbs {
    public static void main(String[] args) {
        dog a = new dog("Bruno", "Mammal");
        a.display();
        cat c = new cat("Minnie", "Mammmal");
        c.display();
        
        
    }
}
