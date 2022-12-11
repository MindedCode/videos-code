//print perfect hallow ractangle  user take input
import java.util.*;
 
public class Main{
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       
     for(int i=1; i<=n; i++){
         // is loop ek far ka kam hum karenge
         for(int j=1; j<=m; j++){
             if(i==1||i==n||j==m||j==1)             
             System.out.print(" * ");
             else System.out.print("   ");
         }
         System.out.println();
         
        //  System.out.print("*");
        //  System.out.print("*");
        //  System.out.print("*");
         
     }
   }
}

**/Output/**

5
6
 *  *  *  *  *  * 
 *              * 
 *              * 
 *              * 
 *  *  *  *  *  * 
