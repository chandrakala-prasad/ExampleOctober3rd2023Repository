package sample1;

public class LadderIf {
	public static void main(String[] args) {
		//Q: WAP to Validate the exam marks to find the class. Here we are doing 
		//multiple checks for the single input
		
//		Marks = 0 to 100;
//		Distinction: 80 - 100
//		First: 79 - 60
//		Second: 59 - 40
//		pass: 39 to 30
//		Fail: <30
		
		int marks = 25;
		
		if((marks>=80) && (marks<=100)) 
		{
			System.out.println("DISTINCTION");
		}
		else if((marks>=60) && (marks<=79)) 
		{
			System.out.println("FIRST CLASS");
		}
		else if((marks>=40) && (marks<=59)) 
		{
			System.out.println("SECOND CLASS");
		}
		else if((marks>=30) && (marks<=39)) 
		{
			System.out.println("PASS CLASS");
		}else {
			System.out.println("Failed. Better Luck next time");
		}
	}
}
