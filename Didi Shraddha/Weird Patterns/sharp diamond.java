import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int t = 4;
		while(t-->0){
    		for(int i=1; i<=n; i++){
    		    for(int j=n-i; j>=1; j--){
    		        System.out.print("  ");
    		    }
    		    for(int j=1; j<=2*i; j++){
    		        System.out.print("* ");
    		    }
    		    System.out.println();
    		}
    // 		down part
    		for(int i=n; i>=1; i--){
    		    for(int j=n-i; j>=1; j--){
    		        System.out.print("  ");
    		    }
    		    for(int j=1; j<=2*i; j++){
    		        System.out.print("* ");
    		    }
    		    System.out.println();
    		}
		}
	}
}


**/Output of the Program::/**

4
      * * 
    * * * * 
  * * * * * * 
* * * * * * * * 
* * * * * * * * 
  * * * * * * 
    * * * * 
      * * 
      * * 
    * * * * 
  * * * * * * 
* * * * * * * * 
* * * * * * * * 
  * * * * * * 
    * * * * 
      * * 
      * * 
    * * * * 
  * * * * * * 
* * * * * * * * 
* * * * * * * * 
  * * * * * * 
    * * * * 
      * * 
      * * 
    * * * * 
  * * * * * * 
* * * * * * * * 
* * * * * * * * 
  * * * * * * 
    * * * * 
      * * 
