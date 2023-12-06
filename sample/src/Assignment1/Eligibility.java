//WAM to check the eligibility for marriage based on gender and age

package Assignment1;
class Elligible_marriage
{
    int age;
	String gender1="boy";
	String gender2="girl";
	void Elligibility_Test(String gender,int age)
	{
			if(gender1==gender)
			{
				if( age>=21)
				{
			      System.out .println(gender + " Eligible for marriage");
		         }else
		         {
			       System.out .println(gender + " is not Eligible for marriage");
		          }
			}
		
			if(gender2==gender)
			{
			
			if(age>=18)
	    	{
			  System.out .println(gender + " Eligible for marriage");
		    }
		    else
		    {
			  System.out .println(gender + " is not  Eligible for marriage");
	   	    }  
		
		
	}
}

}

public class Eligibility
{
 public static void main(String args[])
 {
	 Elligible_marriage test=new Elligible_marriage();
	 String gender= "boy";
	 int age=15;
	 test.Elligibility_Test(gender,age);
 }
 
}
