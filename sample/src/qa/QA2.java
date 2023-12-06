package qa;

public class QA2 {
	public static void main(String[] args) {
		//Q2: Assign 1 D array to 2 D array?

		int arr[] = {10, 20, 30, 40, 50, 60};
		
		int x = 0;
		int res[][] = new int[2][3];
		for(int i=0; i<res.length; i++){
			for(int j=0; j<res[i].length; j++) {
				res[i][j] = arr[x];
				x++;
			}
		}
		
		//Display the value
		for(int i=0; i<res.length; i++){
			for(int j=0; j<res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
