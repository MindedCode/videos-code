import java.util.*;

public class Main
{
    public static void printFib(int a, int b, int n){
        if(n==0)
            return ;
        
        int c = a+b;
        System.out.print(c + " ");
        printFib(b, c, n-1);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the which Fibnacci series nth term of number  :");
	     int n = sc.nextInt();
	     int a = 0, b = 1;
	     System.out.print(a + " " + b + " " );
	     
	     printFib(a, b, n-2);
	}
}


// Output of the Program:

Enter the which Fibnacci series nth term of number  :
10
0 1 1 2 3 5 8 13 21 34 
