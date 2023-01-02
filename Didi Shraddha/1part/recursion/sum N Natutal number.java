import java.util.*;

public class Main{
    
    public static void sumNNatural(int i, int n, int sum){
        
        if(i==n){ // base case
            sum+=i; //time sum = sum + i => 10+1 = 15 
            
            System.out.println("Show output: " + sum); // print(15)
            
            return;
        }
        //   recursion work done and call 
        sum+=i;
        sumNNatural(i+1, n, sum); //n = 5 sum = 0
        
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        
        // function call
        sumNNatural(1, n, 0);
        
    }
}









// Output of the Program:

Enter Number: 
10
Show output: 55
