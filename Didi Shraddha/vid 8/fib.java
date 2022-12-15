/******************************************************************************
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
*******************************************************************************/


import java.util.*;
public class Main
{
    public static void fibonacci(int count){
        int n1=0, n2=1, temp=0;
        System.out.print(n1+" "+n2);
        for(int i=2;  i<count; i++ ){
           temp=n1+n2;    
        System.out.print(" " + temp);    
              n1=n2;    
              n2=temp; 
        }
    }
	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which number fibonacci  ");
        int a = sc.nextInt();
        // int b = sc.nextInt();
        
        fibonacci(a);
	}
}

"Output of the Program "
enter which number fibonacci  
15
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
  
  
  
  
// 2nd method using recursion

//  static int n1=0,n2=1,n3=0;    
//  static void printFibonacci(int count){    
//     if(count>0){    
//          n3 = n1 + n2;    
//          n1 = n2;    
//          n2 = n3;    
//          System.out.print(" "+n3);   
//          printFibonacci(count-1);    
//      }    
//  }    
//  public static void main(String args[]){    
//   int count=10;    
//   System.out.print(n1+" "+n2);//printing 0 and 1    
//   printFibonacci(count-2);//n-2 because 2 numbers are already printed   
//  }  




