import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 0, 4, 5 };
		System.out.println("Original Arr:"+Arrays.toString(arr));
		int tempVar = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++)
			if (arr[i] < arr[j]) {
				tempVar = arr[i];
				arr[i] = arr[j];
				arr[j] = tempVar;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
