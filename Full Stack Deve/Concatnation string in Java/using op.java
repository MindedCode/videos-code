public class Main
{
    public static String concatString(String s1, String s2){
        String s3= s1+s2;   // using + operator
        return s3;
    }
	public static void main(String[] args) {
		System.out.println("Output is: " + concatString("Minded", "Code"));
	}
}

Output is: MindedCode
