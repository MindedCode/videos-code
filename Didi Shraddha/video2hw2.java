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


