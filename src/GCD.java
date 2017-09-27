
public class GCD {
	public static void main(String[] args){
		System.out.println(gcd(10,6));
	}
	
	public static int gcd(int m,int n){
		if (n==0)
			return m;
		return gcd(n,m%n);
	}

}
