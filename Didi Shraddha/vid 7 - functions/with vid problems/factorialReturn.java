// find the factorial of the number.

// Make of func to Multiply 2 Nums & return the Product.

import java.util.*;

public class Main{
    public static void calculateFact(int n){
        
        
        if(n<0){
            System.out.println("Invalid Numbers");
            return;
        }
        int factorical=1;
        for(int i=n; i>=1; i--){
            factorical = factorical*i;
        }
        System.out.println(factorical);
        return;
 
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        calculateFact(a);
    }
}

// import java.util.*;

// public class Main{
//     public static void calculateFact(int n){
        
//         int factorical=1;
//         for(int i=n; i>=1; i--){
//             factorical = factorical*i;
//         }
//         System.out.println(factorical);
//         return;
 
//     }
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
        
//         calculateFact(a);
//     }
// }

**/O/p/**

6
720
