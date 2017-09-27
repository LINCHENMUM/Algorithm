import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int[] A = { 1, 4, 5, 8, 17 };
		int[] B = { 2, 4, 8, 11, 13, 21, 23, 25 };
		int[] C = merge(A, B);
		System.out.println(Arrays.toString(C));

	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] c = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				c[k] = arr1[i];
				i++;
				k++;
			} else {
				c[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			c[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			c[k] = arr2[j];
			j++;
			k++;
		}
		return c;
	}
}