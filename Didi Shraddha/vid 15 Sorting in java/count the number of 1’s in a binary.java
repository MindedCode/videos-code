// Write a program to count the number of 1’s in a binary representation of the number.
import java.util.*;
public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int x = n&(n-1);
        int count=1;
        
        while(x!=0){
            
                count++;
                x = x&(x-1);
                // n--;
            }
        System.out.println(count);
    }
}

"Output"
  
  63
  6
  
  127
  7
