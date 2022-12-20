// length & charAt(). in java


import java.util.*;

public class Main{
    public static void addString(String fN, String lN){
        String fullName = fN + " " + lN;
        System.out.println("Your add first name and last name => full name is : " + fullName + "\nlength is : " + fullName.length());
        int i=0;
        for(i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }
        
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String firstName = sc.next();
        String lastName = sc.next();
        
        addString(firstName,lastName);
    }
}

"Output of the Program "
  
Minded
Code
Your add first name and last name => full name is : Minded Code
length is : 11
M i n d e d   C o d e 
