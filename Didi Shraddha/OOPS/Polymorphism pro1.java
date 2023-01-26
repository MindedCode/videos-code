// Polymorphism - Overloading
// - compile time and runtime


// rule -> factor 
//  return Type
// int id int age (parameter)
// int id String name 
// Single argument pass or multiple argument passing


// Program: 1-----------------------------------

// class Faculcty{
//     String name;
//     int id;
    
//     public void info(String name){
//         System.out.println(name);
//     }
//     public void info(int id){
//         System.out.println(id);
//     }
//     public void info(String name, int id){
//         System.out.println(name + " " + id);
//     }
// }
// public class Main{
//     public static void main (String[] args){
//         Faculcty f1 = new Faculcty();
//         f1.name = "Santosh Sir";
//         f1.id = 19000;
    
//         // f1.info(f1.name);
//         // f1.info(f1.id);
//         f1.info(f1.name, f1.id);
//     }
// }

// O/p is:
// Santosh Sir 19000

-----------------------------------------------------------------------------
// Program : 2 change return type 

class flag{
    String country;
    int number;
    public String detail(String country, int number){   // same function
        System.out.println(country + " " + number);
    }
    public void detail(String country, int number){     // same function
        System.out.println(country + " " + number);
    }
    public int detail(String country, int number ){     // same function compile time error
        System.out.println(country + " " + number);
    }
}

public class Main{
    public static void main (String[] args) {
        Flag f1 = new Flag();
        
        f1.detail(country, number);
    }
}


