import java.util.*;
 


import java.util.*;
 
public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // upper spaces
            for(int j=2*(n-i); j>=1; j--){
                System.out.print("  ");
            }
            // last upper inverted pyramid triangle
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // downpattern ----------------------------------------------------------
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // down spaces
            for(int j=2*(n-i); j>=1; j--){
                System.out.print("  ");
            }
            // last down inverted pyramid triangle
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        
        System.out.println("\n\nButterfly pattern");
   }   
}
   

// second methed
// public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             // first space
//             for(int j=n-i; j>=1; j--){
//                 System.out.print("  ");
//             }
//             // second space
//             for(int j=n-i; j>=1; j--){
//                 System.out.print("  ");
//             }
//             // last upper inverted pyramid triangle
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//         // downpattern ----------------------------------------------------------
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             // first space
//             for(int j=n-i; j>=1; j--){
//                 System.out.print("  ");
//             }
//             // second space
//             for(int j=n-i; j>=1; j--){
//                 System.out.print("  ");
//             }
//             // last down inverted pyramid triangle
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
        
//         System.out.println("\n\nButterfly pattern");
//    }   
// }


**/Output of the Program::/**

5
*                 *  
* *             * *  
* * *         * * *  
* * * *     * * * *  
* * * * * * * * * *  
* * * * * * * * * *  
* * * *     * * * *  
* * *         * * *  
* *             * *  
*                 *  


Butterfly pattern
