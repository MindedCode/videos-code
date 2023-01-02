import java.util.*;
public class Main
{
    public static int CalcFact(int n){
        if(n==1 || n==0)
            return 1;
            
        int fact_n = CalcFact(n-1);
        int fact = n*fact_n;
        return fact;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int ans = CalcFact(n);
		System.out.println(ans);
	}
}

// code 2------------------------------
import java.util.*;

public class Main{
    
    public static int fact(int n){
        
        int ans = 1;
        if(n==1 || n==0)
            return 1;
            
        ans =   n*fact(n-1);
        return ans;
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        
        // function call
        int ans = fact(n);
        System.out.println("Show Output : " + ans);
        
        
    }
}


output 2

// Enter Number: 
// 7
// Show Output : 5040

output 1
// "Output of the program"
// n = 6
  
// 720
