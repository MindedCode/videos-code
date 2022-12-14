/******************************************************************************
Write a function that takes in age as input and returns if that person is 
eligible to vote or not. A person of age > 18 is eligible to vote.
*******************************************************************************/

import java.util.*;
public class Main
{
    public static int eligibleForVote(int n1){
    
       if(n1>18)
        return 1;
       else return 0;
       
    }
	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        
        System.out.println(eligibleForVote(age));
	}
}

"Output of the Program :"
  
12
0
