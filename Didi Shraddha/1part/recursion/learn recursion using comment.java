// learn recursion using comment using print number to n 

import java.util.*;
public class Main
{
    public static void printNum(int n){
        //base case/base condition/reach of state
        if(n == 0){
            return;
        }
        
        // print/show statement of user
        System.out.println(n);
        
        // recursion/for recursion function call
        printNum(n-1);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter the number: ");
	    int n = sc.nextInt();

	    System.out.println("Output is ->");
	   // function call in main
	    printNum(n);
	    
	}
}

Enter the number: 2
Output is ->
2
1
