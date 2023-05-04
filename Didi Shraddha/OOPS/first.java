class Pen{
    String type;
    String color;
    
    void write(){
        System.out.println("Writing something");
    }
    
    void  printInfo(){
        System.out.println(this.color + " " + this.type);
    }
}

class Main{
    public static void main (String[] args) {
        
        Pen p1 = new Pen();
        
        p1.type = "Gel";
        p1.color = "Blue";
        System.out.println("Pen 1 : ");
        p1.write();
        p1.printInfo();
        
        
        Pen p2 = new Pen();
        
        System.out.println("\nPen 2 : ");
        p2.type = "Ballpoint";
        p2.color = "Black";
        p2.printInfo();
        
        
        Pen p3 = new Pen();
        
        System.out.println("\nPen 3 : ");
        p3.type = "Dot";
        p3.color = "Red";
        p3.printInfo();
        
       
        Pen p4 = new Pen();
        
        System.out.println("\nPen 4 : ");
        p4.type = "fountain";
        p4.color = "Green";
        p4.printInfo();
        
        
        
        
    }
}


// output
Pen 1 : 
Writing something
Blue Gel

Pen 2 : 
Black Ballpoint

Pen 3 : 
Red Dot

Pen 4 : 
Green fountain
