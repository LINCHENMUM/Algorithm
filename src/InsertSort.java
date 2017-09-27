import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] list = { 1, 4, 2, 7, 9, 1, 4, 2, -7, 9 ,0};
		System.out.println(Arrays.toString(insertSort(list)));
	}
	public static int[] insertSort(int[] list){
		int temp=0;
		int j=0;
		
		for (int i=1;i<list.length;i++){
			j=i;
			temp=list[i];
			while(j>0 && temp<list[j-1]){
				list[j]=list[j-1];
				j--;
			}
			list[j]=temp;
		}
		return list;
	}
}
//[-7, 1, 1, 2, 2, 4, 4, 7, 9, 9]