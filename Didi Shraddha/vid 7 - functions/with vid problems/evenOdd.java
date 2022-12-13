// Make a function to check if a given number n is even or not..

import java.util.*;

public class Main{
    public static void evenOdd(int n){
        
        if(n<=0){
            System.out.println("Invalid Numbers");
            return;
        }
            if(n%2 == 0)
                System.out.print("This number is even");
            else System.out.print("This number is odd ");
    }
        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        
        evenOdd(p);
    }
}

**/Output of the Program::/**

1000000009
This number is odd 
