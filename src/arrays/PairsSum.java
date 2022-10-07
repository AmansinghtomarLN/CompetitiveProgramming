package arrays;

import java.util.HashMap;
import java.util.Map;

public class PairsSum {

	
	public static void main(String[] args) {
		
		int[] input = new int[] {1,5,7,1};
		int[] input1 = new int[] {1,1,1,1};
		int sum = 2;
		
		pairsSum(input, sum);
		pairsSum(input1, sum);
	}
	
	
	public static void pairsSum(int[] a, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int count = 0;
		
		for(int x: a) {
			int y = sum-x;
			
			if(map.containsKey(y)) {
				map.put(y, map.get(y)+1);
				count = count+ map.get(y);

			}{
				map.put(y, 1);
			}
		}
		System.out.println(count);
	}
	
}
