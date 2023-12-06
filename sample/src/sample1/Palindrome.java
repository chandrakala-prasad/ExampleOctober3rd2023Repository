package sample1;

public class Palindrome {
	public static void main(String args [])
	{
	  int num,temp,i=0,remainder,sum=0;
	  num= 1123210;
	  temp=num;
	  while(num>0)
	  {
		  remainder=num%10;
		  sum=(sum*10)+remainder;
		  num=num/10;
	  }
	  if (sum==temp)
	  {
		  System.out.println(sum +" is palindrome");
	  }
	  else
	  {
		  System.out.println(" num is not palindrome");
	  }
	  }
	}
	



