/******************************************************************************
Write a function that calculates the Greatest Common Divisor of 2 numbers. 
*******************************************************************************/
// Run a loop for x and y from 1 to max of x and y.

// 1st methods---------------------------------------------

import java.util.*;
public class Main
{
    public static void gcd(int n1, int n2){
        int gcd = 1;
        
        for(int i=1;  i <= n1 && i <= n2; i++ ){
             if(n1%i==0 && n2%i==0)
                gcd=i;
        }
        System.out.println(gcd);
    }
	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        gcd(a,b);
	}
}


"Output of the Program :"
  
90
45
45


// 2nd methods -------------------------------------

    // public static void main(String[] args)   
    // {  
    //     int Num1=12, Num2=8, Temp, GCD=0;  
    //     while(Num2 != 0)  
    //     {  
    //         Temp = Num2;  
    //         Num2 = Num1 % Num2;  
    //         Num1 = Temp;  
    //         }  
    //         GCD = Num1;   // yha pr n1 ko hi print kr sakte hai bcoz n2 to null ho chuka h
    //         System.out.println("\n GCD =  " + GCD);  
    //     }  
    // }  



// 3rd methods--------------------------------------------- best methods ----------

    // public static void main(String[] args)   
    // {  
    // int n1=50, n2=60;  
    // while(n1!=n2)   
    // {  
    // if(n1>n2)  
    // n1=n1-n2;  
    // else  
    // n2=n2-n1;  
    // }  
    // System.out.printf("GCD of n1 and n2 is: " +n2);  
    // }  
    // }
