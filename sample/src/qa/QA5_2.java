package qa;

public class QA5_2 {
	public static void main(String[] args) {
		//Q5: Sort the array values?
		int arr[] = {1, 3, 2, 6, 5, 4, 7};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+ " ");
		}
	}
}
