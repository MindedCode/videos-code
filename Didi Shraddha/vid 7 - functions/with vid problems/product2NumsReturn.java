// Make of func to Multiply 2 Nums & return the Product.

import java.util.*;

public class Main{
    public static int calculateSum(int n1, int n2){
        return n1*n2;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum;
        
        System.out.println("Product of two nums:- " + calculateSum(a,b));
    }
}

**/Output of the Program: /**

14
14
Product of two nums:- 196
