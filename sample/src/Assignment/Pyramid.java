package Assignment;

public class Pyramid {

	public static void main(String[] args) {
		int depth=5;
		int width=11;
		String star="*";
		for(int i=0; i<depth; i++) {
			//for(int j=0; j<width; j++) {
				for(int l=depth; l>i; l--) {
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) {
					System.out.print(star);
				}
				for(int m=0; m<i; m++) {
					System.out.print(star);
				}
			//}
			System.out.println();
		}
	}
}
