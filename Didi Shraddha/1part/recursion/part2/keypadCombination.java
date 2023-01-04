public class  Main{
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    
    public static void printKeypadCombination(String number, int idx, String res) {
        if(idx == number.length()) {
            System.out.print(res + ", ");
            return;
        }
    
    for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
        char curr = keypad[number.charAt(idx)-'0'].charAt(i);
        printKeypadCombination(number, idx+1, res+curr);
        }
    }
    public static void main(String args[]) {
    
        String number = "123";
        printKeypadCombination(number, 0, "");
    }
}



// Output of the Program:
adg, adh, adi, aeg, aeh, aei, afg, afh, afi, bdg, bdh, bdi, beg, beh, bei, bfg, bfh, bfi, cdg, cdh, cdi, ceg, ceh, cei, cfg, cfh, cfi,

//// Enter the  "3"

g
h
i


//// Enter the  "23"
dg
dh
di
eg
eh
ei
fg
fh
fi

//// Enter the  "343"
gjg, gjh, gji, gkg, gkh, gki, glg, glh, gli, hjg, hjh, hji, hkg, hkh, hki, hlg, hlh, hli, ijg, ijh, iji, ikg, ikh, iki, ilg, ilh, ili,

