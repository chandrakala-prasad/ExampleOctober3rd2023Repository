package sample1;

public class Reverse {
	public static void main(String args[])
	{
		int num=1234,sum=0,remainder;
		while(num>0)
		  {
			  remainder=num%10;
			  sum=(sum*10)+remainder;
			  num=num/10;
		  }
		System.out.println(sum + " Reverse of the given num is");

	}
}

