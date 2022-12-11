//with of couter print counter

import java.util.*;
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print("");
            }
            for(int j=i; j<=n; j++)
            System.out.print(i+j-1 + " ");
            System.out.println(" ");
        }
	}
}

Output of the program:

9
1 2 3 4 5 6 7 8 9  
3 4 5 6 7 8 9 10  
5 6 7 8 9 10 11  
7 8 9 10 11 12  
9 10 11 12 13  
11 12 13 14  
13 14 15  
15 16  
17 








 
