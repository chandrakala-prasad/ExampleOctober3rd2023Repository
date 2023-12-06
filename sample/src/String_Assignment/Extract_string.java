// 1. welcome to SG testing Institute, extract 'SG testing Institute'
// & make it uppercase

package String_Assignment;

public class Extract_string {
	
	public static void extractString(String str)
	{
		String res=str.substring(10);
		System.out.println(res);
		String res1=res.toUpperCase();
		System.out.println(res1);
	}
	
	public static void main (String args[])
	{
		extractString("welcome to SG testing Institute");
	}

}