// 6. WAP to display the below pattern using for, while and do while loops?
 //A B C
 //D E F
 //G H I


package Assignment;

public class Pattern4 {

	public static void main(String args[])
	{
	// using for loop
		System.out.println("using for loop");
		int i,j;
		for (i=0;i<=2;i++)
		{
			for (j=0;j<=2;j++)
			{
				int val=j+65;
				char ch=(char)val;
				System.out.print(ch+ " ");
			
			}
				//System.out.print(char(j+65));
				
			System.out.println();
		}
	}
}



	