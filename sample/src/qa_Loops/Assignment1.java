package qa_Loops;

public class Assignment1 {
	public static void main(String[] args) {
		//1. WAP to display the below pattern using for, while and do while loops?
		//1 3 5 7 9
		
		int i=1;
		do {
			if((i%2)!=0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<=10);
	}
}
