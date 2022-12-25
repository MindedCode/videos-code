import java.util.*;

public class Main{
    public static void showArr(int arr[], int size){
        for(int i=0; i<size; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static void get(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] a = new int [size];
        
        get(a,size);
        //print arr
        
        
        
        showArr(a, size);
    }
}


"Output"
  
3
2 3 4
2 3 4 
