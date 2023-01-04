// Code  1:

import java.util.*;

public class Main{
    
    public static boolean strictllyIncreOrd(int arr[], int idx){
        
        if(idx == arr.length-1)
            return true;
        
        if(arr[idx] < arr[idx+1])
            return strictllyIncreOrd(arr, idx+1);
        else return false;
            
    } 
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of arr : ");
        int size = sc.nextInt();
        
        System.out.print("Enter the arr : ");
        int arr [] = new int [size];
        
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        
        boolean ans = strictllyIncreOrd(arr, 0);
        System.out.println(ans);
    }
}

// Code 2

import java.util.*;

public class Main{
    
    public static boolean strictllyIncreOrd(int arr[], int idx){
        
        if(idx == arr.length-1)
            return true;
        
        if(arr[idx] < arr[idx+1])
            return strictllyIncreOrd(arr, idx+1);
        else return false;
            
    } 
    
    public static void main (String[] args) {
        
        
        int arr[] = {1,3,3};
        
        
        
        
        boolean ans = strictllyIncreOrd(arr, 0);
        System.out.println(ans);
    }
}


// Output:
arr {1,2,3}
- true
arr {1,2,2}
-false
arr {1,5,4}
-false
    
Enter the size of arr : 3      
Enter the arr : 1 1 2 
false
    
Enter the size of arr : 10
Enter the arr : 2 3 4 5 6 7 8 9 34 3
false
