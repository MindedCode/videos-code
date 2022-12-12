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
                System.out.print("*" + " ");
            }
            // second half
            for(int j=2; j<=i; j++){
                System.out.print("*" + " ");
            }
            
            // second Mountain
            for(int j =2*(n-i); j>=1; j--){
                System.out.print("  ");
            }
            // first half 
            for(int j =i; j>=1; j--){
                System.out.print("*"+ " ");
            }
            // second half
            for(int j=2; j<=i; j++){
                System.out.print("*" + " ");
            }
            
            // 3rd mountain
            for(int j =2*(n-i); j>=1; j--){
                System.out.print("  ");
            }
            // first half 
            for(int j =i; j>=1; j--){
                System.out.print("*"+ " ");
            }
            // second half
            for(int j=2; j<=i; j++){
                System.out.print("*" + " ");
            }
            // 4th mountain
            for(int j =2*(n-i); j>=1; j--){
                System.out.print("  ");
            }
            // first half 
            for(int j =i; j>=1; j--){
                System.out.print("*"+ " ");
            }
            // second half
            for(int j=2; j<=i; j++){
                System.out.print("*" + " ");
            }
            
            System.out.println();
        }
        
        
        // down part -------------------------------------------------------------------------
        for(int i=n; i>=1; i--){
            for(int j =n-i; j>=1; j--){
                System.out.print("  ");
            }
            // first half 
            for(int j =i; j>=1; j--){
                System.out.print("*" + " ");
            }
            // second half
            for(int j=2; j<=i; j++){
                System.out.print("*" + " ");
            }
            
            // second Mountain
            for(int j =2*(n-i); j>=1; j--){
                System.out.print("  ");
            }
            // first half 
            for(int j =i; j>=1; j--){
                System.out.print("*"+ " ");
            }
            // second half
            for(int j=2; j<=i; j++){
                System.out.print("*" + " ");
            }
            
            // 3rd mountain
            for(int j =2*(n-i); j>=1; j--){
                System.out.print("  ");
            }
            // first half 
            for(int j =i; j>=1; j--){
                System.out.print("*"+ " ");
            }
            // second half
            for(int j=2; j<=i; j++){
                System.out.print("*" + " ");
            }
            // 4th mountain
            for(int j =2*(n-i); j>=1; j--){
                System.out.print("  ");
            }
            // first half 
            for(int j =i; j>=1; j--){
                System.out.print("*"+ " ");
            }
            // second half
            for(int j=2; j<=i; j++){
                System.out.print("*" + " ");
            }
            
            System.out.println();
        }
   }   
}


**/Output of the program::/**

8
              *                             *                             *                             * 
            * * *                         * * *                         * * *                         * * * 
          * * * * *                     * * * * *                     * * * * *                     * * * * * 
        * * * * * * *                 * * * * * * *                 * * * * * * *                 * * * * * * * 
      * * * * * * * * *             * * * * * * * * *             * * * * * * * * *             * * * * * * * * * 
    * * * * * * * * * * *         * * * * * * * * * * *         * * * * * * * * * * *         * * * * * * * * * * * 
  * * * * * * * * * * * * *     * * * * * * * * * * * * *     * * * * * * * * * * * * *     * * * * * * * * * * * * * 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * *     * * * * * * * * * * * * *     * * * * * * * * * * * * *     * * * * * * * * * * * * * 
    * * * * * * * * * * *         * * * * * * * * * * *         * * * * * * * * * * *         * * * * * * * * * * * 
      * * * * * * * * *             * * * * * * * * *             * * * * * * * * *             * * * * * * * * * 
        * * * * * * *                 * * * * * * *                 * * * * * * *                 * * * * * * * 
          * * * * *                     * * * * *                     * * * * *                     * * * * * 
            * * *                         * * *                         * * *                         * * * 
              *                             *                             *                             * 
