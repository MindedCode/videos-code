

// index specially start from 0

import java.util.*;
public class Main{
    
    public static int first =-1;
    public static int last = -1;
    
    public static void firstAndLastOccurence(String s, int idx, char ele){
        
        if(idx == s.length()){
            System.out.print(first + " "+ last);
            return ;
        }
        
        char currCh = s.charAt(idx);
        if(currCh == ele){
            if(first ==-1)
                first =idx;
            else last = idx;
        }
        firstAndLastOccurence(s, idx+1, ele);
        
    }
    
    public static void main (String[] args) {
        
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter chech which number occurence : ");
        char occurence = sc.next().charAt(0);
        
        System.out.println("The first and last occurence output : ");
        firstAndLastOccurence(str, 0, occurence);
    }
}

// Output of the Program:

Enter string: Minded Code
Enter chech which number occurence : e
The first and last occurence output : 
4 10
