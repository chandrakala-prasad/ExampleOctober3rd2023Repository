package qa_Loops;

public class Assignment7 {
	public static void main(String[] args) {
		//7. WAP to display the below pattern using for, while and do while loops?
		//1
		//2 3
		//4 5 6
		int x = 1;
		int r=1;
		do {
			int c=1;
			do {
				System.out.print(x+" ");
				c++;
				x++;
			}while(c<=r);
			System.out.println();
			r++;
		}while(r<=3);
		
	}
}
