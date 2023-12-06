
//18. WAM to Reverse the string without using built-in methods?

package strings;

public class Reverse_String {
   static String rev="";
	public static void rev_str(String S)
	{
		for(int i=S.length()-1;i>=0;i--)
		{
			rev+=S.charAt(i);
		}
		System.out.println(rev);
	}
	

public static void main (String args[])
{
	String str ="Welcome to java";
	rev_str(str);
	
}


}



