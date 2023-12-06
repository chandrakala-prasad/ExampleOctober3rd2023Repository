package List;

public class RajendraTest {

	public static void PrintMessage()
	{
		System.out.println("Test Message RajendraTest");
	}
	
	public static void main(String[] args) {
		
		PrintMessage();
		/*
		 * RajendraTest1 rt1 = new RajendraTest1(); rt1.PrintMessage();
		 */ 
	}
}

class RajendraTest1 {

	int var1;
	
	public static void PrintMessage()
	{
		RajendraTest1 rt = new RajendraTest1();
		rt.var1=10;
		System.out.println("Test Message RajendraTest1");
	}
}
