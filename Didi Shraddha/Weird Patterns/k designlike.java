import java.util.*;
 
public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || i==n || j==n)
                System.out.print("* ");
                else System.out.print("  ");
            }
            // upper spaces
            for(int j=2*(n-i); j>=1; j--  ){
                System.out.print("  ");
            }
            // last upper inverted pyramid triangle
            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || i==n || j==n)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println(" ");
        }
        // downpattern                                                           
        for(int i=n; i>=1; i--  ){
            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || i==n || j==n)
                System.out.print("* ");
                else System.out.print("  ");
            }
            // upper spaces
            for(int j=2*(n-i); j>=1; j--  ){
                System.out.print("  ");
            }
            // last upper inverted pyramid triangle
            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || i==n || j==n)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println(" ");
        }
        
        System.out.println("\n\nButterfly pattern");
   }   
}
   



// **/Output of the Program::/**

5
*                 *  
*               *    
*             *      
*           *        
* * * * * * * * * *  
* * * * * * * * * *  
*           *        
*             *      
*               *    
*                 *  


