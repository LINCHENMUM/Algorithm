import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
	
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(5);
		list.add(9);	
				
		List<Set<Integer>> result=new ArrayList<Set<Integer>>();
		result.addAll(powerSet(list));
		System.out.println(result.toString());
		for(Set<Integer> r:result){
			System.out.println(r.toString());
		}		
	}
    public static List<Set<Integer>> powerSet(List<Integer> X){
    	List<Set<Integer>> P=new ArrayList<Set<Integer>>();
    	Set<Integer> S=new HashSet<Integer>();
    	P.add(S);
    	List<Set<Integer>> T=new ArrayList<Set<Integer>>();;
    	while(!X.isEmpty()){
    		Integer f= (Integer) X.remove(0);
    		for(Set<Integer> x:P){
    			T.add(x);
    		}
    		for(Set<Integer> t:T){
    			S = new HashSet<Integer>();
    			S.add(f);
    			S.addAll(t);
    			P.add(S);
    		}
    	}
    	return P;
    }
}