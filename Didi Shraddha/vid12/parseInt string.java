// The method generally used to convert String to Integer in Java is parseInt(). This method belongs to Integer class in java. lang package. 
// It takes a valid string as a parameter and parses it into primitive data type int.


// ParseInt Method of Integer class


public class Main {
   public static void main(String args[]) {
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);
       String str1 = "123";
       int number1 = Integer.parseInt(str1);
       System.out.println(number1+number);
      
      
   }
}


// Output
123
246
