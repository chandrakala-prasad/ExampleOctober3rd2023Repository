
//WAM to find sum of two arrays
package Assignment1;

class array_method
{
	int ar1[]=new int[5];
	int ar2[]=new int[5];
	int ar3[]=new int[5];
	int i;
	
	void arrayadd(int ar1[],int ar2[])
	{
		for(i=0;i< ar1.length;i++)
		{
			ar3[i]=ar1[i]+ar2[i];
		}
		for(i=0;i<ar3.length;i++)
		{
		System.out.print(ar3[i]+" ");
		}
	}
}

public class Sumof2arraysmethod
{
   public static void main(String args[])
		{
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {5,10,5,10,5};
		
		array_method add=new array_method();
		add.arrayadd(arr1,arr2);
		
	     }

}
