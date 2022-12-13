// Make a function to print the table of a given number n.

import java.util.*;

public class Main{
    public static void numOfTable(int n){
        System.out.println("Show table\n");
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
        
    }
        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        numOfTable(t);
    }
}

"""/Output of the Program/"""
  
  
  21
Show table

21 * 1 = 21
21 * 2 = 42
21 * 3 = 63
21 * 4 = 84
21 * 5 = 105
21 * 6 = 126
21 * 7 = 147
21 * 8 = 168
21 * 9 = 189
21 * 10 = 210
