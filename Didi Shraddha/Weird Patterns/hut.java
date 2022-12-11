// Print a solid rhombus hut.

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
	}
}

//      * * * * * * *  
//     * * * * * * *  
//   * * * * * * *  
// * * * * * * *  
// * * * * * * *  
// * * * * * * *  
// * * * * * * *  


    

//  j= i i= n  
// print 0 or 1;
 

**/Output of the program/**

7
      * * * * * * *  
    * * * * * * *  
  * * * * * * *  
* * * * * * *  
* * * * * * *  
* * * * * * *  
* * * * * * *  
