import java.util.*;

public class Main{
    
    public static boolean [] map = new boolean[26]; // arr
    
    public static void rmDuplicates(String s, int idx, String newS){
        
        if(idx == s.length() ){
            System.out.println(newS);
            return ;
        }
        
        // Step  2
        char currCh = s.charAt(idx);
        if(map[currCh - 'a'])
            rmDuplicates(s, idx+1, newS );
        else{
            newS += currCh;
            map[currCh - 'a'] = true;
            rmDuplicates(s, idx+1, newS);
        }
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        
        rmDuplicates(str, 0, " ");
    }
}



// Output of the Program:
Enter the string : mindedcode
 mindeco
//  ///errors  reason isme only duplicate english small letters hi  remove hoge string me se 
// not allowed :
// literal , spaces, cps letter  counting and other char
Enter the string : Minded Code
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -20 out of bounds for length 26
        at Main.rmDuplicates(Main.java:16)
        at Main.main(Main.java:32)
  
Enter the string : Minded     
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -20 out of bounds for length 26
        at Main.rmDuplicates(Main.java:16)
        at Main.main(Main.java:32)

  
 Enter the string : minded    Code
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -65 out of bounds for length 26
        at Main.rmDuplicates(Main.java:16)
        at Main.rmDuplicates(Main.java:17)
        at Main.rmDuplicates(Main.java:21)
        at Main.rmDuplicates(Main.java:21)
        at Main.rmDuplicates(Main.java:21)
        at Main.rmDuplicates(Main.java:21)
        at Main.rmDuplicates(Main.java:21)
        at Main.main(Main.java:32)
