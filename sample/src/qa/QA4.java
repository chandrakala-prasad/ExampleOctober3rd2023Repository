package qa;

import java.util.Arrays;

public class QA4 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		
		int a[] = arr;
		System.out.println(Arrays.toString(a));
		
		int b[] = arr.clone();
		System.out.println(Arrays.toString(b));
		
		int c[] = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(c));
		
		int d[] = new int[arr.length];
		for(int i=0; i<d.length; i++) {
			d[i] = arr[i];
		}
		System.out.println(Arrays.toString(d));
	}
}
