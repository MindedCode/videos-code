// Write a program transpose Matrix using own create function

import java.util.*;

public class Main{
    public static void transposeMatrix(int Matrix[][], int n, int m){
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int [n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                matrix[i][j] = sc.nextInt();
        }
        
        System.out.println("Transpose Matrix : ");
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++)
                System.out.print(matrix[i][j] + " ");
                System.out.println();
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int [n][m];

        transposeMatrix(arr, n, m);
        
    }
        
}

"Output of the Program:"
  
2
3
1 2 3
1 2 3
Transpose Matrix : 
1 1 
2 2 
3 3
