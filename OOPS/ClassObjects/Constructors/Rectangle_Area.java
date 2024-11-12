class Rectangle{
    private double width ;
    private double breadth;
    

    public Rectangle(double width , double breadth){
        this.width = width;
        this.breadth = breadth;
    }
    public double Area(){
        return width * breadth;
    }
    public double perimeter(){
        return  2* (width + breadth);
    }
}

public class Rectangle_Area {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2, 4);
        System.out.println("Area " + r1.Area());
        System.out.println("Perimeter " + r1.perimeter());
    }    
}
