 //1. String str = "India is great"
//o/p: "India is GREAT"

package strings;

public class Stringeg2 {

	public static void main(String args[])
	{
		String str="India is great";
		String str1=str.substring(9);
		System.out.println(str1);
		String str2=str1.toUpperCase();
		System.out.println(str2);
	}
}