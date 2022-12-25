// Write a program to find if a number is a power of 2 or not

import java.util.*;

public class Main{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    if((n & n-1) == 0)
        System.out.println("power of 2");
    else
        System.out.println("no");
    }
}

"Output of the Program"
  
1024
power of 2
