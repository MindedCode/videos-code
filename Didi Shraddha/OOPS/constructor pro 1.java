class Laptop{
    String name;
    String processor;
    int ram = 16;
    Laptop(){
        System.out.println("non parameteried constructor call ");
        System.out.println(this.name);
        System.out.println(this.ram);
        System.out.println(this.processor);
        
    }
}
public class Main{
    public static void main(String args[]){
        
        //Create obeject-------------------------
        // class name => Laptop
        // obeject name => lap1
        // new         => in heap memory allocator
        // constructor call/specific func => Laptop()

        Laptop lap1 = new Laptop();
        lap1.name = "Acer";
        lap1.processor = "intel";
        
        // Laptop();
        
    }
}

Output is:

non parameteried constructor call 
null
16
null
