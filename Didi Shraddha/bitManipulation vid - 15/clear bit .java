//clear 3rd bit (position = 2) of a  number n. n = 0101  numbering 3 2 1 0 

import java.util.Scanner;
public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        int n = sc.nextInt();
        int pos = sc.nextInt();
        
        int bitMask = 1<<pos;
        
        int notBitMask = ~bitMask;
        
        int newNum = notBitMask & n;
         
         System.out.println(newNum);
     
    }
}


"Output of the Program::"
  
  
5
2
1
