class Animal{
    String name;
    String sound;

    public Animal(String name,String sound){
        this.sound = sound;
        this.name = name;
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is Sleeping");
    }
    public void makeSound(){
        System.out.println(name + " is " + sound);
    }
}
class Mammal extends Animal{
    
    public Mammal(String name,String sound){
        super(name,sound);
    } 
    public void walk(){
        System.out.println(name + " is Walking.");
    }
}
class Bird extends Animal{
    public Bird(String name,String sound){
        super(name,sound);
    }

    public void Fly(){
        System.out.println(name + " is Flying.");
    }
}

class Fish extends Animal{

    public Fish(String name,String sound){
        super(name,sound);
    }
    public void Swim(){
        System.out.println(name + " is Swimming.");
    }
}
public class Animal_Kingdom {
    public static void main(String[] args) {
        
        Mammal Elephant = new Mammal("Elephant","Gar");
        Elephant.eat();
        Elephant.sleep();
        Elephant.walk();
        Elephant.makeSound();

        Bird Eagle = new Bird("Eagle ", "Crowling");
        Eagle.eat();
        Eagle.sleep();
        Eagle.Fly();
        Eagle.makeSound();
    }
}
