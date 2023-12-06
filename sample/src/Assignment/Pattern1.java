
  //3. WAP to display the below pattern using for, while and do while loops?
//1 1 1 1
//2 2 2 2
//3 3 3 3


package Assignment;

public class Pattern1 {
	public static void main(String args[])
	{
	// using for loop
		System.out.println("using for loop");
		int i,j;
		for (i=1;i<=3;i++)
		{
			for (j=1;j<=4;j++)
			{
				System.out.print(i +" ");
			
			}
			System.out.println();
		}

		// using while loop
			System.out.println("using while loop");
			
		  i=1;
		  j=1;
			while(i<=3)
			{
				while(j<=4)
				{
					System.out.print(i +" ");
					j++;
				}
				j=1;
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
							System.out.print(i +" ");  
							j++;
						  }while(j<=4);
						 j=1;
						 i++;
						 System.out.println("");
					 }while(i<=3);
					  
			
	}
	
}
