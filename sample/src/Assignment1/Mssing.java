//WAM to find the missing number

package Assignment1;
class Missing_element
{
	int i;
	void missing_method()
	{
		int arr[]= {1,2,4,7,9,10};
		int temp=0;
		int i;
		for(i=0;i<arr[arr.length-1];i++)
		{
			if (i==arr[temp])
			{
				temp++;
			}
			else
			{
				System.out.print(i+" ");
			}
		//	temp=temp+1;
		}
		
	}
}



public class Mssing 
{
	public static void main(String args[])
	{
		Missing_element element=new Missing_element();
		element.missing_method();
	}

}
