// Copy constructor 
// c++ se ye concept aaya hai and by default constructor and copy constructor hote 
// but java me user define constructor krta hai
 
class Student {
    String name;
    int id;
    
    public void info(){
        System.out.println(this.name);
        System.out.println(this.id + "\n");
    }
    Student(Student s2){
        this.name = s2.name;
        this.id = s2.id;
    }
    Student(){
        
    }
}
public class Main{
    public static void main (String[] args) {
        Student s1 = new Student();
        s1.name = "Minded Code";
        s1.id = 24;
        // Student 2
        Student s2 = new Student(s1); // all property of s1 => s2 me define kr di
        
        s2.info();
        
    }
}


// Output is :
Minded Code
24
