/******************************************************************************
Two numbers are entered by the user, x and n. Write a function to find 
*******************************************************************************/

import java.util.*;
public class Main
{
    public static void userInputFind(int n){
        int x = 12;
        int y = 23;
        int z = 35;
        if(x==n || y==n || z==n)
            System.out.println("This number is find");
        else {
            System.out.println("not found");
            int i=1;
            do{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            }while(x==n || y==n || z==n);
            
            
            // if(x==n || y==n || z==n)
            // System.out.println("This number is find");
        }
    }
	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        userInputFind(a);
	}
}
