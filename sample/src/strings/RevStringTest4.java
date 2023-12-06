package strings;

public class RevStringTest4 {

	public static void rev()
	{
	  String str="abcd";
	  for (int i=str.length()-1;i>=0;i--)
	  {
	     System.out.print(str.charAt(i)+" ");    
	   }
	}

public static void main(String args[])
{
	rev();
}
}

