//WAM where output of method1 is input of method 2
// method 1 ----gives monthly salary
//method 2------should take outputof method 1 and calculate CTC

package Assignment1;

class Sal_cal
{
	int salary;
	int benefits;
	int sal_method()
	{
		//int salary;
		salary=75000;
		System.out.println( "Saalry=" +salary);
		return salary;
		
	}
	void CTC_method(int salary)
	{
		benefits=5000;
		int CTC=salary+benefits;
		System.out.println("CTC ="+ CTC);
	}
}


public class Sal_ctc 
{

	public static void main (String args[])
	{
		Sal_cal sal= new Sal_cal();
		Sal_cal CTC= new Sal_cal();
		
		int salary=sal.sal_method();
		CTC.CTC_method(salary);
		
	}
	

}
