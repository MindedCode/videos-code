// Learn OOPS first Simple Program 


// create blueprint of Pen 
class Pen{ // no use any access modifier/specifier 

// create a variable 
    String brand;
    String type;
    
    // create work of Pen
    public void write(){
        System.out.println("Writing Something");
    }
    
}


 // create Object of the Pen class
public class Main{
        public static void main(String [] args){
            
            // Create Object of Pen
            // (cls name)  (Ob name) = new cls func
            Pen pen1 = new Pen();
            
            // store the value
            pen1.brand = "DOMS";
            pen1.type = "gel";
            
            
            // method call
            
            pen1.write();
            
    
    }
}
    

// Output is:
writing something
