// Print a palindromic number pyramid.

import java.util.*;
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++)
            System.out.print(i+i + " ");
            System.out.println(" ");
        }
	}
}

//      1
//     21 2
//    321 32
//   4321 234
//  54321 2345
// 654321 23456








 
