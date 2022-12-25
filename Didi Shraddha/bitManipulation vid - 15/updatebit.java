//clear 3rd bit (position = 2) of a  number n. n = 0101  numbering 3 2 1 0 
// update the 2nd  bit (position = 1) of a number to 1. n = 0101
import java.util.Scanner;
public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the clear '0' or update '1' ");
        int op = sc.nextInt();
        System.out.println("Enter number: ");
        int n = sc.nextInt(); //0101
        System.out.println("Enter position: ");
        int pos = sc.nextInt(); //1 pos
        
        int bitMask = 1<<pos;
        
        if(op == 1)
        {
            int newNum = bitMask|n;
            System.out.println(newNum);
        }
        else{
        int notBitMask = ~bitMask;
        
        int newNum = notBitMask & n;
         
         System.out.println(newNum);
        }
    }
}

"Output:"
Enter the clear '0' or update '1' 
1
Enter number: 
5
Enter position: 
-1
-2147483643
