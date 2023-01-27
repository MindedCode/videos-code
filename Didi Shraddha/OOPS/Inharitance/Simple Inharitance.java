// Inharitance : jab base class se take property and then subclass me use kar liya jata.

class Shape{ // base/parent class: take property
    String color;
    int sides; //bhujayen
}

class Triangle extends Shape{  // sub class : receive/use property shape class extends
    public void info(String color, int sides){
        System.out.println("Triangle color : " + color + "\nTriangle sides : " + sides);
    }
}
public class Main{
    public static void main (String[] args) {
        Triangle  t1 = new Triangle();
//         use shape class propertie
        t1.color = "black"; // but use  the triangle class
        t1.sides = 3;
        
        t1.info(t1.color, t1.sides);
    }
}

// Output of the Program:
Triangle color : black
Triangle sides : 3
