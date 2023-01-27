// multilevel Inharitance: me 1 base class ki more than class hoti.
// ex : shape 
// -Triangle class
// EquilateralTriangle class 


class Shape{
    String color;
    int sides; //bhujayen
}

class Triangle extends Shape{
    public void info(String color, int sides){
        System.out.println("Triangle color : " + color + "\nTriangle sides : " + sides);
    }
}
class EquilateralTriangle extends Triangle{
    public void info(String color, int sides, int fSides, int SecSides){
        System.out.println("Triangle color : " + color + "\nTriangle sides : " + sides);
        System.out.println("\nTriangle first side : " + fSides + "\nTriangle second side : " + SecSides );
    }
}
public class Main{
    public static void main (String[] args) {
        Triangle  t1 = new Triangle();
        
        t1.color = "black";
        t1.sides = 3;
        
        t1.info(t1.color, t1.sides);
        
        EquilateralTriangle t2 = new EquilateralTriangle();
        
        t2.color = "red";
        t2.sides = 3;
        
        t2.info(t2.color, t2.sides, 4, 4);
        
        
    }
}

// Output is:
Triangle color : black
Triangle sides : 3
// Equilateral Triangle property
Triangle color : red 
Triangle sides : 3

Triangle first side : 4
Triangle second side : 4
