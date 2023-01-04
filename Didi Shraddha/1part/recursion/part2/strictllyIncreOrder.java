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
