/******************************************************************************
Enter 3 numbers from the user & make a function to print their average.
*******************************************************************************/
import java.util.*;
public class Main
{
    public static void threeNumAvg(int n1, int n2, int n3){
        int sum = n1+n2+n3;
        int avg = sum/3;
        System.out.println(avg);
    }
	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        threeNumAvg(a,b,c);
	}
}

"Output of the Program: "
45
45
45
45
