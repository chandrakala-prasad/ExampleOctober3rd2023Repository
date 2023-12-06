
//  20. remove the duplicate values?


 package String_Assignment;

public class Remove_duplicatevalues {

	public static void main (String args[]) 
	{
		int a[]= {10,20,20,30,30,40,50};
		int b[]=new int[a.length];
		int j=0;
			for(int i=0;i<6;i++)
			{
		
			  if(a[i]!=a[i+1])
			  {
				b[j++]=a[i];
			  }
			else
			{
				continue;

		     }
			}
			b[j++]=a[a.length-1];
		for (j=0;j<5;j++)
		{
			System.out.print(b[j]+" ");
		}
		
	}
}

 