/******************************************************************************
Qs. Print if a number is prime or not (Input n from the user). 

*******************************************************************************/

import java.util.*;
public class Main{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int counter = 1;
        int i = 2;
        while(i<=n){
            if(n%i == 0)
                counter++;
                i++;
	    }
	    if(counter == 2)
            System.out.println("This is Prime");
        else
            System.out.println("This is no Prime");
	}
}


**/output/**

97
This is Prime
