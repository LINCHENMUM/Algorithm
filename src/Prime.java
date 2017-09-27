
public class Prime {

	public static void main(String[] args){
		int n=9;
		System.out.println(n+" is Prime is "+isPrime(n));
	}	
		public static boolean isPrime(int n){
			for(int i=2;i<n-1;i++){
				if (n%i==0)
				{
					return false;
				}
			}
			return true;	
		}
		
		public static int gcd(int m,int n){
			if (n==0)
				return m;
			return gcd(n,m%n);
		}
}
