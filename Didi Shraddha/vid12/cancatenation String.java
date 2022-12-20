// String Cancatenation using cancatenation function 
import java.util.*;

public class Main{
    public static void addString(String fN, String lN){
        String fullName = fN + " " + lN;
        System.out.println("Your add first name and last name => full name is : " + fullName);
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String firstName = sc.next();
        String lastName = sc.next();
        
        addString(firstName,lastName);
    }
}
