// print numbers from 1 to 6 using recursion
public class Main{
    public static void printNum(int i){
        
        if(i==6)
        return ;
        System.out.print(i + " ");
        printNum(i+1);
    }
    
    public static void main (String[] args) {
        
       
        int n = 1;
        printNum(n);
    }
}

"Output of the Program:"
 1 2 3 4 5
