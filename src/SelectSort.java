import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] list = { 1, 4, 2, 7, 9, 1, 4, 2, -7, 9 };
		System.out.println(Arrays.toString(selectSort(list)));
	}

	public static int[] selectSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int minPostion = getMinPosition(list, i, list.length - 1);
			int temp = list[i];
			list[i] = list[minPostion];
			list[minPostion] = temp;
		}
		return list;
	}

	public static int getMinPosition(int[] list, int bottom, int top) {
		int index = bottom;
		int value = list[bottom];
		for (int k = bottom + 1; k <= top; k++) {
			if (value > list[k]) {
				value = list[k];
				index = k;
			}
		}
		return index;
	}
}
// [-7, 1, 1, 2, 2, 4, 4, 7, 9, 9]
