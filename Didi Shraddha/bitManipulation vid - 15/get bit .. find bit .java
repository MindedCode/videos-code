//Get 3rd bit (position = 2) of a  number n. n = 0101  numbering 3 2 1 0 

import java.util.Scanner;
public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = 1;
        while(t<6){
        int n = sc.nextInt();
        int pos = sc.nextInt();
        
        int bitMask = 1<<pos;
        
        if((bitMask&n) == 0)
            System.out.println("bit was zero");
        else
            System.out.println("bit was one");
        t++;}
    }
}

"Output of the Program:"
  
  5
2
bit was one
5
0
bit was one
5
1
bit was zero
5
2
bit was one
5
6
bit was zero
