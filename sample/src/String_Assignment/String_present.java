//2. I have a string "India is great". Check great is presernt in the given string?

package String_Assignment;

public class String_present {
	public static void main(String args[])
	{
		String str= "India is ";
		String str1=str.substring(9);
		System.out.println(str1);
		if(str.contains(str1))
		{
		  System.out.println(str1+" great is present in the string");	
		
		}else 
		{
			System.out.println( str +" is not present in the string");
		}
	}

}
