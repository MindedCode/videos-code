/******************************************************************************
Write a program to enter the numbers till the user wants and at the end it 
should display the count of positive, negative and zeros entered. 
*******************************************************************************/

import java.util.*;
public class Main
{
    public static int positiveTillsum(int n){
        
        int sum = 1;
        for(int i=1; i<=sum; i++){
            
            sum+=i;
            
            if(sum%2 == 0)
                return sum;
            else return 0;
        }
    }
	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        positiveTillsum(a);
	}
}
