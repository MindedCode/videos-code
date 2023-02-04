import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		int months;
        
        for (months = 3; months>0; months--) {
            amount = amount * 90/100; 
        }
        System.out.println(amount);
		
	}
}

Output is:
200000
145800
