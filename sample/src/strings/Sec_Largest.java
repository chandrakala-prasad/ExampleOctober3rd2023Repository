
//10. WAP to display the second max number from the array without using sorting?

package strings;

public class Sec_Largest {
	public static void main (String args[])
	{
		int arr[]={10,5,3,8,9};
		int first=0;
		int second=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>first)
			{
				second=first;
				first=arr[i];
			}else if (arr[i]>second) 
			{
				second=arr[i];
			}
		}
		System.out.println("the second max number from the array "+second);
	}

}
