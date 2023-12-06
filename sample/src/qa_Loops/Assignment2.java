package qa_Loops;

public class Assignment2 {
	public static void main(String[] args) {
		//2. WAP to display the below pattern using for, while and do while loops?
		//9 7 5 3 1
		
		int i=10;
		do {
			if((i%2)!=0) {
				System.out.print(i+" ");
			}
			i--;
		}while(i>=1);
	}
}
