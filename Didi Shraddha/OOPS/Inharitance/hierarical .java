// hierarical Inharitance: me 1 base class ki more than class hoti.
// ex : shape 
// -Triangle class
// circle class


class Shape{
    String color;
    int sides; //bhujayen
}

class Triangle extends Shape{
    public void area(int b, int h){
        System.out.println("Area of Triangle : " + ( b*h) / 2 );
    }
}
class Circle{
    public void area(int r){
        System.out.println("Area of Circle : " + 3.14*r*r);
    }    
}

public class Main{
    public static void main (String[] args) {
        Triangle  t1 = new Triangle();
        
        t1.area(4,3);
        
        Circle c1 = new Circle();
        
        c1.area(5);
        
    }
}


Output is:

Area of Triangle : 6
Area of Circle : 78.5
