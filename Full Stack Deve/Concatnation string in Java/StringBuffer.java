// Using a StringBuffer:
public class Main{
    public static void main(String args[]){
        String s1= "This";
        String s2= "Is";
        String s3= "Edubca";
        String s4="Training";
        // create StringBuffer Instance
        StringBuffer sb=new StringBuffer("Minded");
        //call append method for string concatenate
        StringBuffer concatenatedstr=sb.append(" ").append("Code").append(" ").append("Practicing");
        System.out.println("Concatenated String using String Buffer is :: " + concatenatedstr );
    }
  
  
//   Output is:
//   Concatenated String using String Buffer is :: Minded Code Practicing
