//inverted half piramid
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(n-i >= j)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println(" ");
        }
	}
}

//   *
//  **  
// ***
    
//  j= 2 i= 1  s s
//  j =1 i= 2  s
 


**/Output of the program/**

5
    * 
   ** 
  *** 
 **** 
***** 
