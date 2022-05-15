package recursion;

public class IncreasingDecreasingNumbers {

	public static void main(String[] args) {
	//	System.out.println("factorial is "+factorial(5));
	//	decreasing(5);
	//	increasing(5);
		decreIncre(5);
	}
	
	public static  void decreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		decreasing(n-1);
		
	}
	
	
	public static  void increasing(int n) {
		if(n==0) {
			return;
		}
		increasing(n-1);
		System.out.println(n);
	}
	//5432112345
	public static void decreIncre(int n) {
		if(n==0) {
			return ;
		}
		System.out.println(n);
		decreIncre(n-1);
		System.out.println(n);
	}
	// 1234554321
	public static void increDecre(int n) {
		if(n==0) {
			return ;
		}
		increDecre(n-1);
		System.out.println(n);
		System.out.println(n);
	}
	
	public static int factorial(int n) {
		if(n==1) {
			return 1;		
			}
		return n*factorial(n-1);
				
	}
	
	
}
