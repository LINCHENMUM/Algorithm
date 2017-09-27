import java.util.Arrays;

public class ReverseSort {
	public static void main(String[] args) {
		int[] list = { 1, 2,3, 4, 5, 6, 7, 8, 9, 10 ,11};
		System.out.println(Arrays.toString(reverseSort(list)));
	}
	public static int[] reverseSort(int[] list){
		int len=list.length;
		for(int i=0;i<len/2;i++){
			int temp=list[i];
			list[i]=list[len-1-i];
			list[len-1-i]=temp;
		}
		return list;
	}
}
