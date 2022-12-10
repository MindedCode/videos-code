/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
*/

// Code here in java:

import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("This calucator is all perform arithematic calculation again by again - %, /, *, -, + ");
        int t = 5;
        while(t-->0){
            System.out.print("which calculation of operater: ");
            // char c = sc.next().charAt(0);
            char op = sc.next().charAt(0);
            
            System.out.print("Enter first operand: ");
            float num1 = sc.nextInt();
            
            System.out.print("Enter second operand: ");
            float num2 = sc.nextInt();
            
            switch(op){
                case '%': System.out.println("remainder = " +num1%num2 + "\n"); 
                            break;
                case '/': System.out.println("Division = " + num1/num2 + "\n"); 
                            break;
                case '*': System.out.println("Multiplication = " + num1*num2 + "\n"); 
                            break;
                case '-': System.out.println("Difference = " + (num1-num2) + "\n"); 
                            break;
                case '+': System.out.println("Addition = " + (num1+num2) + "\n"); 
                            break;
                default: System.out.println("this numbers is invalid input\n");
            }
        }
        System.out.println("\n                          ---TONY--");
    }
}


**/Output of the program: /**

This calucator is all perform arithematic calculation again by again - %, /, *, -, + 
which calculation of operater: +
Enter first operand: 34
Enter second operand: 34
Addition = 68.0

which calculation of operater: -
Enter first operand: 34
Enter second operand: 5
Difference = 29.0

which calculation of operater: 
*23
Enter first operand: 23
Enter second operand: 23
Multiplication = 529.0

which calculation of operater: /
Enter first operand: 34
Enter second operand: 5
Division = 6.8

which calculation of operater: 
90
Enter first operand: 45
Enter second operand: 34
this numbers is invalid input


                          ---TONY--
