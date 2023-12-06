//WAM to display the num of occurence of the given city name from the array

package Assignment1;
 class Find_city {
	
	void Findduplicate_city()
	{
		int i,count=0;
		String city[]= { "Bangalore", "Mangalore","Shimoga", "Bangalore"};
		String select_city= "Bangalore";
		//int count;
		//count=0;
		for ( i=0;i<city.length;i++)
		{
			if(select_city==city[i])
			{
				count=count+1;
			}
		}
		System.out.println(count);

}
 }
public class Duplicate_City
{
	public static void main(String args[])
	{
		
	Find_city Duplicate_city =new Find_city();
	Duplicate_city.Findduplicate_city();
	}
}