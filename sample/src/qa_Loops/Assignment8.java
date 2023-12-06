package qa_Loops;

public class Assignment8 {
	public static void main(String[] args) {
		//8. WAP to display the below pattern using for, while and do while loops?
		//    *
		//   * *
		//  * * *
		// * * * *
		
		int r=1;
		do {
			int c=1;
			do {
				if((r+c)<=4) {
					System.out.print(" ");
				}else {
					System.out.print("* ");
				}
				c++;
			}while(c<=4);
			System.out.println();
			r++;
		}while(r<=4);

	}
}
