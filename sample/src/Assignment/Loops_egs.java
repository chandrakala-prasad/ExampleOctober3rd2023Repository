 //2. WAP to display the below pattern using for, while and do while loops?
//9 7 5 3 1

package Assignment;

public class Loops_egs {
	public static void main(String args[])
	{
	  //Using for loop
		System.out.println(" using for Loop");
		for (int i=10;i>=0;i--)
		{
			if((i%2)==1)
			{
				System.out.print(i+ " ");
			}
		}
		System.out.println(" ");
	
		//Using while loop
		System.out.println(" using while Loop");
		
		int i=10;
		while(i>=0)
		{
			if ((i%2)==1)
			{
				System.out.print(i+ " ");
			}
		   i--;
		}
		System.out.println(" ");
		//Using do while loop
		System.out.println(" using do while Loop");
		i=9;
		do
		{
			if ((i%2)==1)
			{
				System.out.print(i+ " ");
			}
			i--;
		}while(i<=10);
		
	}	
}
