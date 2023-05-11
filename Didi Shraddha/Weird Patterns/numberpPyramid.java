public class Main {
    // static int j = 1;
    public static void main(String[] args) {
        // int j =1;
        for(int i=1; i<=5; i++){
            for(int j =1; j<=5-i; j++){
                System.out.print("-");
            }
            for(int j =1; j<=i; j++){
                System.out.print(j + "+");
            }
            System.out.println();
        }
    }
}


----1+
---1+2+
--1+2+3+
-1+2+3+4+
1+2+3+4+5+
