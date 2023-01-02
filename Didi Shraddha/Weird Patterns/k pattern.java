import java.util.*;

public class Main{
    
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            
            // space
            for(int j=1; j<=n; j++){
                if(j<2*i-1)
                    System.out.print(" ");
            }
                
            for(int j=1;j<=n;j++){
                if(j<n-i+1)
                    System.out.print("*");
            } 
             // upper space among
        // for(int i=1;i<=n;i++){
            
            // space
            // for(int j=2*n; j>=1; j--){
            //     if(j<2*i-1)
            //         System.out.print(" ");
            // }
            for(int j=2*(n-i); j>=1; j--){
                System.out.print(" ");
            }
                
            for(int j=1;j<=n;j++){
                if(j<n-i+1)
                    System.out.print("*");
            }System.out.println();
        
        }
        
       
        
        // 2st part ka second part 
        
        for(int i=n;i>=1;i--){
            
            // space
            for(int j=1; j<=n; j++){
                if(j<2*i-1)
                    System.out.print(" ");
            }
                
            for(int j=1;j<=n;j++){
                if(j<n-i+1)
                    System.out.print("*");
            } 
             // upper space among
        // for(int i=1;i<=n;i++){
            
            // space
            // for(int j=2*n; j>=1; j--){
            //     if(j<2*i-1)
            //         System.out.print(" ");
            // }
            for(int j=2*(n-i); j>=1; j--){
                System.out.print(" ");
            }
                
            for(int j=1;j<=n;j++){
                if(j<n-i+1)
                    System.out.print("*");
            }System.out.println();
        }
        
    }
}


**/Ouput of the Program:/**

15
**************                            **************
  *************                          *************
    ************                        ************
      ***********                      ***********
        **********                    **********
          *********                  *********
            ********                ********
              *******              *******
               ******            ******
               *****          *****
               ****        ****
               ***      ***
               **    **
               *  *
               
               
               *  *
               **    **
               ***      ***
               ****        ****
               *****          *****
               ******            ******
              *******              *******
            ********                ********
          *********                  *********
        **********                    **********
      ***********                      ***********
    ************                        ************
  *************                          *************
**************                            **************
