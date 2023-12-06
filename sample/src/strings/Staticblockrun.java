package strings;

public class Staticblockrun {
	{
	}
	
	static
	{
		System.out.println("Static Block 1");
	}
	
	static 
	{
		System.out.println("Static Block 2");
		
	}

public static void main (String args[])
{
	
	try
	{
		Class.forName("staticMembers.Staticblockrun");
	}catch(Exception e)
	{
		System.out.println("class not found exception");
	}
}

}

