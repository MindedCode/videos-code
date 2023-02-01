//Using String.concat() method:
public class Main
{
    public static String concatString(String s1){
        String s= "Code";
        String s2=s.concat(s1);   // using concat method
        return s2;
    }
	public static void main(String[] args) {
		System.out.println("Output is: " + concatString("Minded"));
	}
}

// Output is: CodeMinded
