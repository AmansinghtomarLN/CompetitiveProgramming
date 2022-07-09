package recursion;

public class IncreasingDecreasingNumbers {

	public static void main(String[] args) {
	//	System.out.println("factorial is "+factorial(5));
	//	decreasing(5);
	//	increasing(5);
	//	decreIncre(5);
		System.out.println(exponential(2, 4));
	}
	
	
	public static int exponential(int x, int n) {
		if(n<=1) { // because power can be  0  Otherwise -> n==1  
			return x;
		}
	
		return x * exponential(x, n-1);
	}
	
	
	/*
     p(5) = 5 p(4)
	 p(5) = 5 4 3 2 1 		   
	 p(4) = 4 3 2 1
			   
	*/			
			   	
	public static  void decreasing(int n) {
		if(n==0) {
			return;
		}
		decreasing(n-1);
		System.out.println(n);
		
	}
	
	/*
    p(5) =  p(4) 5
	 p(5) = 1 2 3 4 5 		   
	 p(4) = 1 2 3 4 
			   
	*/				
	public static  void increasing(int n) {
		if(n==0) {
			return;
		}
		increasing(n-1);
		System.out.println(n);
	}
	//5432112345

	/*
    p(5) =  5 p(n) 5
	 p(5) = 1 2 3 4 5 5 4 3 2 1  		   
	 p(4) = 1 2 3 4     4 3 2 1 
			   
	*/				
	
	public static void decreIncre(int n) {
		if(n==0) {
			return ;
		}
		System.out.println(n);
		decreIncre(n-1);
		System.out.println(n);
	}
	
	public static int factorial(int n) {
		if(n==1) {
			return 1;		
			}
		return n*factorial(n-1);
				
	}
	
	
}
