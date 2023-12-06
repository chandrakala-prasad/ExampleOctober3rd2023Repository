//WAM to perform multiplication of two numbers

package Assignment1;

class mul
{
	int i;
    int j;
    int k;
	
	int multiplication(int i,int j)
	{
		k=i * j;
		return k;
		//System.out.println(k);
	}
}


public class Num_mul 
{
  public static void main(String args[])
  {
	  int m;
      int num1;
      int num2;
      num1=100;
      num2=2;
      mul multi=new mul();
      m = multi.multiplication(num1,num2);
      System.out.println("Multiplication of " +num1+ " and " +num2 + "="+ m);
	  
  }
	
}
