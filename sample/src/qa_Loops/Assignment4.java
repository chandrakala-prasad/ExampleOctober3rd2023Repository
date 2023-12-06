package qa_Loops;

public class Assignment4 {
	public static void main(String[] args) {
		//4. WAP to display the below pattern using for, while and do while loops?
		//*
		//* *
		//* * *
		
		int r=1;
		do {
			int c=1;
			do {
				System.out.print("* ");
				c++;
			}while(c<=r);
			System.out.println();
			r++;
		}while(r<=3);
	}
}
