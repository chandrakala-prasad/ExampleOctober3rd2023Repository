//2.WAM to check wheather the given city is present in alist of cities

package Assignment1;

class Match
{
	void Matching_city()
	{
	String city[]= {"Bangalore","shimoga","tumkur","mangalore"}	;
	   String Givencity= "shimoga";
	  boolean flag=false;
	   for (int i=0;i<city.length;i++)
	   {
		   if(Givencity==city[i])
		   {
			   flag=true;
			   break;
		   }
	   }
	   if (flag==true)
	   {
		   System.out.println(Givencity + " was found");
	   }
	   else
	   {
		   System.out.println(Givencity +" was not found");
	   }

}
	}


public class FindCity
{
   public static void main(String args[])
   {
	   Match city=new Match();
	   city.Matching_city();
	   
   }
}

