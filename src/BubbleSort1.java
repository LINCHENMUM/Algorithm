import java.util.Arrays;


public class BubbleSort1 {
	public static void main(String[] args){
	//int[] list={0,1,2,3,4,5,6,7,8,9};
	int[] list={9,8,7,6,5,4,3,2,1,0};
	System.out.println(Arrays.toString(bubbleSort(list)));
	}
	
	public static int[] bubbleSort(int[] list){
		for(int i=0;i<list.length;i++){
			for(int j=0;j<list.length-1;j++){
				if(list[j]>list[j+1]){
					int temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
		return list;
	}

}
