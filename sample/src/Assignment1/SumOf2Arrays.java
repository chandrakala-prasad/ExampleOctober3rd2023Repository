//WAP to find sum of two arrays

package Assignment1;

public class SumOf2Arrays
{
	public static void main(String args[])
	{
	int arr1[]= {10,20,30,40,50};
	int arr2[]= {5,10,5,10,5};
	int arr3[]= new int[5];
	for(int i=0;i< arr1.length;i++)
	{
		arr3[i]=arr1[i]+arr2[i];
	}
	
	for(int i=0;i<arr3.length;i++)
	{
	System.out.print(arr3[i]+" ");
	}
}
}
