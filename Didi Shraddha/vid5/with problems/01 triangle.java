import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2 == 0)
                System.out.print("1" + " ");
                else System.out.print("0" + " ");
                    
                
            }
            System.out.println(" ");
        }
	}
}

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1


// 11
// 21 22
// 31 32 33
// 41 42 43 44
// 51 52 53 54 55

// i+j ka sum if even hai to print 1 and odd hai to print 0
    

//  j= i i= n  
// print 0 or 1;
 
