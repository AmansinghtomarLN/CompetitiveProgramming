package recursion;

public class TargetSumSubSets {

	public static void main(String[] args) {
		int[] arr = new int[]{10,20,30,40,50};
		
		int target  = 60;
		targetSumSubSets(arr, target,0);
		
	}
	
	
	public static void targetSumSubSets(int[] a, int t, int index){
		int rem = 0;
		int temp = 0;
		for(int i =0; i<a.length;i++) {
			rem = t-a[i];
			for(int j=0; j<a.length;j++) {
				if(index==a.length) {return;}
				if(i==j) {continue;}
				if(a[j]==rem) {
					temp = a[j];
					System.out.println(temp+","+a[i]+","+rem);
					targetSumSubSets(a, rem, index+1);
				}
			}
		}
		
	}
	
}
