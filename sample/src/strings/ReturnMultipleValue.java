package strings;

public class ReturnMultipleValue {
	public static int[] Arithmetic_values(int i,int j)
	{
		int add=i+j;
		int sub=i-j;
		int mul=i*j;
		int div=i/j;
		int mulval[]= {add,sub,mul,div};
		return mulval;
	}
public static void main(String args[])
{
	
	int a, b;
	a=20;
	b=10;
	int reval[]=Arithmetic_values(a,b);
	System.out.println("addition of" +a +"and "+b +"=" + reval[0]);
	System.out.println("subtraction of" +a +"and "+b +"=" + reval[1]);
	System.out.println("multiplication of" +a +"and "+b +"=" + reval[2]);
	System.out.println("division of" +a +"and "+b +"=" + reval[3]);

	
	
}
}
