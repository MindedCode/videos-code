import java.util.*;

public class Main {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            
               System.out.print(arr[i] + " ");
        }
    }
    public static void main (String[] args) {
        
        // bubble sort
        int arr [] = { 9,6,4,32,3,5};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // sorted arr
        print(arr);
    }
}

// Output of the program4

3 4 5 6 9 32 
