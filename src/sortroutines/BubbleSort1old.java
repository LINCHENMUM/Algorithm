package sortroutines;

import java.util.Arrays;

import runtime.Sorter;

/**
 * This is the slowest version of BubbleSort No optimization for already sorted
 * arrays. Doesn't take into account the fact that largest elements are pushed
 * to the right.
 *
 */
public class BubbleSort1old extends Sorter {

	int[] arr;

	public int[] sort(int[] array) {
		this.arr = array;
		bubbleSort();
		return arr;

	}

	private void bubbleSort() {

		int len = arr.length;
		for (int i = 0; i < len; ++i) {
			boolean flag=true;
			for (int j = 0; j < len - 1; ++j) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1);
					flag=false;
				}
			}
			if(flag){
				break;
			}
		}
	}

	int[] swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;

	}

	public static void main(String[] args) {
		//int[] test = { -22, 1, 5, 13, 18, 21, 51 };
		int[] test = { 51, 21, 18, 13, 5, 1, -22 };
		//int[] test = { 21, 13, 1, -22, 51, 5, 18 };
		BubbleSort1old bs = new BubbleSort1old();

		System.out.println(Arrays.toString(bs.sort(test)));

	}

}
// [-22, 1, 5, 13, 18, 21, 51]
