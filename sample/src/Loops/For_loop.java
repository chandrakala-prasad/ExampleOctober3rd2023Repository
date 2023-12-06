//WAP to display numbers and find even and odd numbers

package Loops;

public class For_loop {

	public static void main(String args[])
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Value of i is " +i);
		}
	
	for (int i=0;i<=10;i++)
	{
		//i=i%2;
		
		if ((i%2)==0)
		{
			System.out.println(" print even numbers " +i);
			
		}
	}
	
	for (int i=0;i<=10;i++)
	{
		//i=i%2;
		
		if ((i%2)!=0)
		{
			System.out.println(" print odd numbers " +i);
			
		}
	}
	}
}
