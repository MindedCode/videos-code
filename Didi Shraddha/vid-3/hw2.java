/*Ask the user to enter the number of the month & print the name of the month. 
For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
*/

// Code here in java:

import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Which u want know the number of month: ");
            // char c = sc.next().charAt(0);
            int month = sc.nextInt();

            
            switch(month){
                case 1: System.out.println("January" + "\n"); 
                            break;
                case 2: System.out.println("February" + "\n"); 
                            break;
                case 3: System.out.println("March" + "\n"); 
                            break;
                case 4: System.out.println("April" + "\n"); 
                            break;
                case 5: System.out.println("May " + "\n"); 
                            break;
                case 6: System.out.println("Jun " + "\n"); 
                            break;
                case 7: System.out.println("July" + "\n"); 
                            break;
                case 8: System.out.println("August" + "\n"); 
                            break;
                case 9: System.out.println("September" + "\n"); 
                            break;
                case 10: System.out.println("Octuber" + "\n"); 
                            break;
                case 11: System.out.println("November" + "\n"); 
                            break;
                case 12: System.out.println("December" + "\n"); 
                            break;
                default: System.out.println("this numbers is invalid input\n");
            }
        System.out.println("\n-----------------------TONY------------------------");
    }
}


**/Output of the program :/**


Which u want know the number of month: 7
July


-----------------------TONY------------------------
