// Print a palindromic number pyramid.

import java.util.*;
 
public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j =n-i; j>=1; j--){
                System.out.print("  ");
            }
            // first half 
            for(int j =i; j>=1; j--){
                System.out.print(j + " ");
            }
            // second half
            for(int j=2; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
   }   
}


//      1
//     21 2
//    321 32
//   4321 234
//  54321 2345
// 654321 23456








 
