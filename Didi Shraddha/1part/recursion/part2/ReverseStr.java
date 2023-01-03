import java.util.*;
public class Main{
    
    public static void printRev(String s, int idx){
        
        if(idx == 0){
            System.out.print(s.charAt(idx));
            return ;
        }
        
        System.out.print(s.charAt(idx));
        printRev(s, idx-1);
    }
    
    public static void main (String[] args) {
        
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        
        System.out.println("the reverse string output : ");
        printRev(str, str.length()-1 );
    }
}

// Output
Enter string: MahaManaMadanMohanMalveeya 
the reverse string output : 
ayeevlaMnahoMnadaManaMahaM


// Output: 2
/// Enter string:
High-pressure chemistry is concerned with those chemical processes that are carried out under high pressure
– pressures in the thousands of bars (100 kPa) or higher. High-pressure processes are generally faster and 
have a higher conversion efficiency than processes at ambient pressure. However, they are usually only beneficial
on an industrial scale because of the investment in plant required.[1]

///the reverse string output : 
]1[.deriuqer tnalp ni tnemtsevni eht fo esuaceb elacs lairtsudni na no laicifeneb ylno yllausu era yeht ,revewoH
.erusserp tneibma ta sessecorp naht ycneiciffe noisrevnoc rehgih a evah dna retsaf yllareneg era sessecorp 
erusserp-hgiH .rehgih ro )aPk 001( srab fo sdnasuoht eht ni serusserp �� erusserp hgih rednu tuo deirrac era
taht sessecorp lacimehc esoht htiw denrecnoc si yrtsimehc erusserp-hgiH

