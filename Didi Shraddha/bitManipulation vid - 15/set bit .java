//Set 2nd bit (position = 1) of a  number n. n = 0101  numbering 3 2 1 0 

import java.util.Scanner;
public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int t = 1;
        // while(t<){
        int n = sc.nextInt();
        int pos = sc.nextInt();
        
        int bitMask = 1<<pos;
         int ans = bitMask|n;
         System.out.println(ans);
     
    }
}

Output----------------

5
1
7
    
    
    2nd output => 
    5
    2
    5
