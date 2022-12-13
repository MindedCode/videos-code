

import java.util.*;
public class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--)
                    System.out.print(" ");
                    temp=1;
            // upper middle Numbers 
            for(int j=0; j<=i; j++){
                System.out.print(temp + " ");
                temp = temp*(i-j)/(j+1);
            }
            System.out.println();
        }
    }   
}
   



// **/Output of the Program::/**

// Print Pascal’s Triangle.
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1



// Butterfly pattern
