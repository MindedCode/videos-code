// spiral matrix alphabet using 2d array 

// Print the spiral order matrix as output for a given matrix of numbers.
import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        char matrix[][] = new char[size][size];
        
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++)
                matrix [i][j] = sc.next().charAt(0);
        }
        
        System.out.println("Enter spiral order of matrix :");
          int rowStart = 0;
          int rowEnd = size-1;
          int colStart = 0;
          int colEnd = size-1;


        // print matrix
        // 1
          while(rowStart <= rowEnd && colStart <= colEnd) {
          //1
          for(int col=colStart; col<=colEnd; col++) {
              System.out.print(matrix[rowStart][col] + " ");
          }
          rowStart++;
          
        //  2 
          for(int row=rowStart; row<=rowEnd; row++) {
              System.out.print(matrix[row][colEnd] +" ");
          }
          colEnd--;
         
          //3
          for(int col=colEnd; col>=colStart; col--) {
              System.out.print(matrix[rowEnd][col] + " ");
          }
          rowEnd--;
 
          //4
          for(int row=rowEnd; row>=rowStart; row--) {
              System.out.print(matrix[row][colStart] + " ");
          }
          colStart++;
 
          System.out.println();
      }
   }
}


**/Outpt of the Program: /**

5
a b c d e  
p q r s f
o x y t g
n w v u m
m l k j i
Enter spiral order of matrix :
a b c d e f g m i j k l m n o p 
q r s t u v w x 
y 
