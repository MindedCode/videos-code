// find the factorial of the number.

import java.util.*;

public class Main{
    public static void calculateFact(int n){
        
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

**/O/p/**

6
720
