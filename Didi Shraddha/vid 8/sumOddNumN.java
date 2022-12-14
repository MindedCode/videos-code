/******************************************************************************
Write a function to print the sum of all odd numbers from 1 to n.
*******************************************************************************/
import java.util.*;
public class Main
{
    public static void sumOddNumN(int n){
        int result = 0;
        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                result = result + i;   // 7+5+3+1 = 16
            }
        }
        System.out.println(result);
    }
	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        
        sumOddNumN(a);
	}
}


"Output of the program:"
 7
 16
