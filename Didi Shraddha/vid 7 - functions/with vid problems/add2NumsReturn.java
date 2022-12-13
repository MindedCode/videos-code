// Make of func to add 2 Nums & return the sum.

import java.util.*;

public class Main{
    public static int calculateSum(int n1, int n2){
        int sum = n1+n2;
        return sum;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum;
        
        sum = calculateSum(a,b);
        
        System.out.println("addition of two nums:- " + sum);
    }
}


**Output of the Program**

3
34
addition of two nums:- 37
