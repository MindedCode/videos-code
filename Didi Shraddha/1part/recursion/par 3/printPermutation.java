// Print all permutation of a string

import java.util.*;

public class Main
{
    public static void printPerm(String  s, String permutation){
        //base case 
        if(s.length()==0){
            System.out.println(permutation);
            return;
        }
        
        //Operatin
        for(int i=0; i<s.length(); i++){
            char currChar = s.charAt(i);
            // "abc" -> 'ab' / 'ba'
            
            String newStr = s.substring(0, i) + s.substring(i+1);
            printPerm(newStr, permutation + currChar);
        }
            
    }
    
	public static void main(String[] args) {
	    Scanner  sc = new Scanner(System.in);
		System.out.println("Intput String : ");
		
		String str = sc.nextLine();
		printPerm(str, " ");
	}
}


// Output of the Program: 
Intput String : 
hi C
 hi C
 hiC 
 h iC
 h Ci
 hCi 
 hC i
 ih C
 ihC 
 i hC
 i Ch
 iCh 
 iC h
  hiC
  hCi
  ihC
  iCh
  Chi
  Cih
 Chi 
 Ch i
 Cih 
 Ci h
 C hi
 C ih
