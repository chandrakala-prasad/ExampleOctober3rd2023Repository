 //19. find duplicate vlaues?


package String_Assignment;

public class DuplicateValues {
	public static void main (String args[])
	{
		int arr[]= {1,4,2,2,3,3,6,6,7,8,8};
		
		System.out.println ("Duplicate values are" );
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.print( + arr[i] + " ");
				}
					
			}
		}
	}

}
