import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        int  [] [] numbers = new int [row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                numbers [i][j] = sc.nextInt(); 
            }
        }
        
        //Output of Matrix
        System.out.println("\n array of  element\n ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(numbers[i][j] + " "); 
            }
            System.out.println();
        }
    }
}

"Output of the program :"
  
  3
5
1
2 4 5 6
1 2 34 5 6
1 2 3  4 
5 

 array of  element
 
1 2 4 5 6 
1 2 34 5 6 
1 2 3 4 5 
