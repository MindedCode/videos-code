// Print the sum of first n natural numbers.

// code 1
class Main {
    public static void printSum(int n, int sum) {
        if(n == 0) {
        System.out.println(sum);
        return;
    }
        sum += n;
        printSum(n-1, sum);
    }
    public static void main(String args[]) {
        printSum(5, 0);
    }
}




// Code 2

public class Main
{
    public static void printNum(int i, int n, int sum ){
        if(i==n){
            sum+=i;
            System.out.println(sum) ;
            return;
        }
        // System.out.println(n);
        sum+=i;
        printNum(i+1,n,sum);
    }
    
	public static void main(String[] args) {
	    
		printNum(1, 5, 0);
	}
}

"OUTPUT "
15
