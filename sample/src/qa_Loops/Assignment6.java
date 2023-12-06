package qa_Loops;

public class Assignment6 {
	//6. WAP to display the below pattern using for, while and do while loops?
	//A B C
	//D E F
	//G H I
	public static void main(String[] args) {
		char ch = 'A';
		
		int r=1;
		do {
			int c=1;
			do {
				System.out.print(ch+" ");
				ch++;
				c++;
			}while(c<=3);
			System.out.println();
			r++;
		}while(r<=3);
	}
}
