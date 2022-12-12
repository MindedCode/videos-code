// Hallow rhombus

public class Main
{
	public static void main(String[] args) {
	int n = 6;
// 	int l = 6;
	
	for(int i=1; i<=n; i++){
	   // Spaces
	   for(int j=n-1; j>=i; j--){
	       System.out.print(" ");
	   }
	   //print Hallow rhombus
    	  for(int j=1; j<=n; j++){
    	    if(i==1 || j==1 || i==n || j==n)
    	        System.out.print("* " );
	        else 
	        System.out.print("  ");
    	    }
	    System.out.println();
	    }
	}
}


**/Output of the Program/**

     * * * * * * 
    *         * 
   *         * 
  *         * 
 *         * 
* * * * * * 

// n == spacess;
      * * * * * * 
     *         * 
    *         * 
   *         * 
  *         * 
 * * * * * * 
