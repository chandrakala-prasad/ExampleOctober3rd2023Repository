package qa;

public class QA3 {
	public static void main(String[] args) {
		//Q3: Assign 2 D array to 1 D array?

		int arr[][] = {{10, 20}, {30, 40}, {50, 60}};
		
		int res[] = new int[arr.length * arr[0].length];
		
		int x = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				res[x] = arr[i][j];
				x++;
			}
		}
		
		//display the value
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
