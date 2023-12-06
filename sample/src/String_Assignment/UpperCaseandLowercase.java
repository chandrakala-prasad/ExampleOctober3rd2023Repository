//7. WAP to display the given String as upper case & lower case alternatively


package String_Assignment;

public class UpperCaseandLowercase {
 public static void main(String args[])
 {
	 String str ="India is our country";
	 System.out.println("The given string is ");
	 System.out.println(str);
	 System.out.println("Upper Case");
	String str1=str.toUpperCase();
	System.out.println(str1);
	System.out.println("Lower Case");
	String str2=str.toLowerCase();
	System.out.println(str2);
 }
}
