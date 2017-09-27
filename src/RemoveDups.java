import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDups {
	
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(3);
		list.add(9);
		list.add(9);
		list.add(9);
		list.add(9);
		list.add(3);
		list.add(3);
				
		List<Integer> result=new ArrayList<Integer>();
		result.addAll(RemoveDups(list));
		System.out.println(result.toString());	
	}
    public static List<Integer> RemoveDups(List<Integer> X){
    	List<Integer> P=new ArrayList<Integer>();
    	Map<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
    	for (int i=0;i<X.size();i++){
    		int key=X.get(i);
    		if(!hashmap.containsKey(key))
    			hashmap.put(key, 0);
    	}
    	for(Integer key:hashmap.keySet())
    		P.add(key);
    	return P;
    }
}