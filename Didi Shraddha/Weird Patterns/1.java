import java.util.*;
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++)
            System.out.print("*" + " ");
            System.out.println(" ");
        }
        
        // down part
         for(int i=n; i>=1; i--){
            for(int j=n-i; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++)
            System.out.print("*" + " ");
            System.out.println(" ");
        }
	}
}




 

// **/Output of the program/**

import java.util.*;
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++)
            System.out.print("*" + " ");
            System.out.println(" ");
        }
        
        // down part
         for(int i=n; i>=1; i--){
            for(int j=n-i; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++)
            System.out.print("*" + " ");
            System.out.println(" ");
        }
	}
}




 

// **/Output of the program/**
10
         * * * * * * * * * *  
       * * * * * * * * * *  
     * * * * * * * * * *  
   * * * * * * * * * *  
 * * * * * * * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
 * * * * * * * * * *  
   * * * * * * * * * *  
     * * * * * * * * * *  
       * * * * * * * * * *  
         * * * * * * * * * *  
