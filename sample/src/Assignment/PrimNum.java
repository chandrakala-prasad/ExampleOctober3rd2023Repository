package Assignment;

public class PrimNum {
	public static void main (String args[])
	{
		int num=30;
		int flag=1;
		for (int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(num + " is a prime num ");
		}
		if (flag==0)
		{
			System.out.println(num + " is not a prime num ");
		}
	}

}
