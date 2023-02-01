// Using StringBuilder:
public class Main
{
    
    
	public static void main(String[] args) {
	    int capacity =5;
	    StringBuilder sb= new StringBuilder(capacity); // create string builder instance
    sb.append("first").append(" ").append("second"); // call append method specifying string to be concatenated
		System.out.println("Output is: " + sb);
	}
}

// Output is: first second
