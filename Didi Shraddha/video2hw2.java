/******************************************************************************
Q --- Make a program that prints the table of a number that is input by the user. 

*******************************************************************************/

// Code here :

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        System.out.println("the number of table => " + number);
        
        int i = 1;
        while(i<=10){
            int table = number*i;
            
            System.out.println(number + " * " + i +" = " + table );
            i++;
        }
	}
}


2---------------------------------------------------------------------------------------
	/******************************************************************************
Q --- Make a program that prints the table of a number that is input by the user. 

*******************************************************************************/

// Code here :

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        System.out.println("the number of table => " + number);
        
        // int i = 1;
        // while(i<=10){
            // int table = number*1;
            

            
            
            System.out.println(number + " * " + 1 +" = " + number*1 );
            System.out.println(number + " * " + 2 +" = " + number*2 );
            System.out.println(number + " * " + 3 +" = " + number*3 );
            System.out.println(number + " * " + 4 +" = " + number*4 );
            System.out.println(number + " * " + 5 +" = " + number*5 );
            System.out.println(number + " * " + 6 +" = " + number*6 );
            System.out.println(number + " * " + 7 +" = " + number*7 );
            System.out.println(number + " * " + 8 +" = " + number*8 );
            System.out.println(number + " * " + 9 +" = " + number*9 );
            System.out.println(number + " * " + 10 +" = " + number*10 );
        //     i++;
        // }
	}
}


**/Output of the program :/**

6
the number of table => 6
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54
6 * 10 = 60


