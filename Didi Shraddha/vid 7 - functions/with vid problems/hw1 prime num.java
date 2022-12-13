// Make of func to Multiply 2 Nums & return the Product.

import java.util.*;

public class Main{
    public static void prime(int n){
        
        
        if(n<=0 || n==1){
            System.out.println("Invalid Numbers");
            return;
        }
        int counter=1;
        for(int i=2; i<=n; i++){
            if(n%i == 0){
                counter++;
                
            }
        }
        if(counter == 2){
            System.out.print("This number is prime");
        }
        else System.out.println("This number is not prime");
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        prime(a);
    }
}

**/Output of the program/**

9
This number is not prime
