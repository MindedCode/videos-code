import java.util.HashSet;
public class Main {
    public static void printSubseq(String str, int idx, String newStr, HashSet<String>set) {
        
        if (idx == str.length()){
            if(set.contains(newStr))
                return ;
            else{
                System.out.println(newStr);
                set.add(newStr);
                return ;
            }
        } 
         //choose
        printSubseq(str, idx+1, newStr+str.charAt(idx), set);
        //don't choose
        printSubseq(str, idx+1, newStr, set );
    }
    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";
        HashSet <String> set = new HashSet <> ();
        printSubseq(str2, 0, "", set );
    }
}


// Output of the Program:
//// Enter "aaa"
aaa
aa
a
//// Enter "abc" :

abc
ab
ac
a
bc
b
c
