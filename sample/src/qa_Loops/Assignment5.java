package qa_Loops;

public class Assignment5 {
	public static void main(String[] args) {
		//5. WAP to display the below pattern using for, while and do while loops?
		//* * *
		//* *
		//*
		
		int r=4;
		do {
			int c=1;
			do {
				System.out.print("* ");
				c++;
			}while(c<=r);
			System.out.println();
			r--;
		}while(r>=1);
	}
}
