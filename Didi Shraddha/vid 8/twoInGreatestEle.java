/******************************************************************************
Write a function which takes in 2 numbers and returns the greater of those two.
*******************************************************************************/
// 1st code

import java.util.*;
public class Main
{
    public static int twoInGreatestEle(int n1, int n2){
        if(n1<n2)
            return n2;
        else return n1;
    }
	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int c = sc.nextInt();
        
        System.out.println("Element is Greatest " + twoInGreatestEle(a,b));
	}
}

"Output :"
456
567
Element is Greatest 567




// 2nd code no return answer--------------------------------------------


// import java.util.*;
// public class Main
// {
//     public static void twoInGreatestEle(int n1, int n2){
//         int result = 0;
//         if(n1==n2)
//         System.out.println("This is inputs equal");
//         else if(n1<n2)
//             System.out.println(n2 + " This number is greatest ");
//         else System.out.println( n1 +  " This number is greatest ");
//     }
// 	public static void main(String[] args) {
    
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         // int c = sc.nextInt();
        
//         twoInGreatestEle(a,b);
// 	}
// }

// "Output of the program"
  
//  45
//  67
//  67 This number is Greatest
