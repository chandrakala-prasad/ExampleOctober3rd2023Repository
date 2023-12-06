package qa_Loops;

public class Assignment3 {
	public static void main(String[] args) {
		//3. WAP to display the below pattern using for, while and do while loops?
		//1 1 1 1
		//2 2 2 2
		//3 3 3 3
		
		int r=1;
		do {
			int c=1;
			do {
				System.out.print(r+" ");
				c++;
			}while(c<=4);
			System.out.println();
			r++;
		}while(r<=3);
	}
}
