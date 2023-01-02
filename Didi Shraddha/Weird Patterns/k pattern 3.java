import java.util.*;

public class Main{
    
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            
            // space
            for(int j=1; j<=2; j++){
                    System.out.print(" ");
            }
                
            for(int j=1; j<=2; j++){
                    System.out.print("***");
            }
            
            for(int j=2*(n-i); j>=1; j--){
                System.out.print(" ");
            }
                
            for(int j=1;j<=n-i+1;j++){
                    System.out.print("**");
            }System.out.println();
        
        }
        
       
        
        // 2st part ka second part 
        
        for(int i=n;i>=1;i--){
            
             // space
            for(int j=1; j<=2; j++){
                    System.out.print(" ");
            }
                
            for(int j=1; j<=2; j++){
                    System.out.print("***");
            }
            
            for(int j=2*(n-i); j>=1; j--){
                System.out.print(" ");
            }
                
            for(int j=1;j<=n-i+1;j++){
                    System.out.print("**");
            }System.out.println();
        
        }
        
    }
}




// Output of the Program:

6
  ******          ************
  ******        **********
  ******      ********
  ******    ******
  ******  ****
  ********
  ********
  ******  ****
  ******    ******
  ******      ********
  ******        **********
  ******          ************
