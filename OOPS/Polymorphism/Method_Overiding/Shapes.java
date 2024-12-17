class Draw_Shape{
    public void draw(){
        System.out.println("Drawing shapes: ");
    }
}

class Rectangle extends Draw_Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Square extends Draw_Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Square");
    }
}

public class Shapes {
    public static void main(String[] args) {
      Draw_Shape d1 = null;
      
      d1 = new Rectangle();
      d1.draw();

      d1 = new Square();
      d1.draw();
    }    
}
