import java.util.ArrayList;
import java.util.List;

public class Brute {
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(7);
		list.add(2);
		list.add(9);
		List<Integer> T=subsetsum(list,16);
		System.out.println(T==null?"There is no subset T that have the subset to compute k":("T can be:"+T.toString()));
		
	}
	public static List<Integer> subsetsum(List<Integer> s,int k){
		if(k==0) return new ArrayList<Integer>();
		if(s.size()==0) return null;
		
		int lastItem=s.get(s.size()-1);
		s.remove(s.size()-1);
		List<Integer> subList1=subsetsum(new ArrayList<Integer>(s),k-lastItem);
		if(subList1!=null){
			subList1.add(lastItem);
			return subList1;
		}
		
		
		List<Integer> subList2=subsetsum(new ArrayList<Integer>(s),k);
		if(subList2!=null){
			return subList2;
		}
		return null;
	}

}
