 //7. WAP to display the below pattern using for, while and do while loops?
 // *
 // * *
 // * * *


package Assignment;

public class Pattern3 {
	public static void main(String args[])
	{
	// using for loop
		System.out.println("using for loop");
		int i,j;
		for (i=1;i<=3;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print("* ");
				}
			System.out.println();
		}

		// using while loop
			System.out.println("using while loop");
			
		  i=1;
		  j=1;
			while(i<=3)
			{
				while(j<=i)
				{
					System.out.print("* ");
					j++;
					
				}
				j=j+1;
				i++;
				System.out.println();
				
			}
			// using  do while loop
						System.out.println("using do while loop");
						
					  i=1;
					  j=1;
					 do
					 {
						 do 
						  {
							System.out.print("* ");  
							j++;
						  }while(j<=3);
						 j=i+1;
						 i++;
						 System.out.println("");
					 }while(i<=3);
					  
			
	}

}
