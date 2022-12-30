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


"Output of the program"
n = 6
  
720
