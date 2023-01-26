// parameteried Constructor

class Student {
    
    String name;
    int id;
    
    public void info(){
        System.out.println(this.name);
        System.out.println(this.id + "\n");
    }
    Student(String name , int id){
        this.name = name;
        this.id = id;
    }
    
}

public class Main{
    public static void main (String[] args) {
        Student s1 = new Student("Minded", 100);
        
        // methed call
        s1.info();
        
        // Student 2
        Student s2 = new Student("Code", 101);
        
        s2.info();
        
        // Student 3
        Student s3 = new Student("Adarsh", 102);
        s3.info();
        
        // Student 4
        Student s4 = new Student("Kumar", 103);
        s4.info();
    }
}


// Output is:
Minded
100

Code
101

Adarsh
102

Kumar
103
