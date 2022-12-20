// max and min using Integer.MAX_VALUE, Integer.MIN_VALUE

import java.util.*;
 
public class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];
 
      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }
 
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }
 
       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
      
   }
}


"Output of the program:"
10
1
2
34
56
99
8888
6
4
3
5
Largest number is : 8888
Smallest number is : 1
