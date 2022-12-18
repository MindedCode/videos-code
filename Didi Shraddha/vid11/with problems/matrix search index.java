import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        int  [] [] numbers = new int [row][col];
        int key = 45;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                numbers [i][j] = sc.nextInt(); 
            }
        }
        
        //Output of Matrix
        System.out.println("\n array of  element\n ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                 if(key == numbers[i][j])
                System.out.print(i + " " + j); 
            }
            // System.out.println();
        }
    }
}


"Output of the program :"
  
  3
5
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 45 

 array of  element
 
2 4
