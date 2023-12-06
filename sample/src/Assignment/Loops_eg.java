  //1. WAP to display the below pattern using for, while and do while loops?
  //1 3 5 7 9

package Assignment;

public class Loops_eg {

	public static void main(String args[])
	{
	  //Using for loop
		System.out.println(" using for Loop");
		for (int i=1;i<=10;i++)
		{
			if((i%2)==1)
			{
				System.out.print(i+ " ");
			}
		}
		System.out.println(" ");
		//Using while loop
		System.out.println(" using while Loop");
		
		int i=1;
		while(i<=10)
		{
			if ((i%2)==1)
			{
				System.out.print(i+ " ");
			}
			i++;
		}
		System.out.println(" ");
		//Using do while loop
		System.out.println(" using do while Loop");
		i=1;
		do
		{
			if ((i%2)==1)
			{
				System.out.print(i+ " ");
			}
			i++;
		}while(i<=10);
		
		
		
	}
}
