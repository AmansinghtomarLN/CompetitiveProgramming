package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachIteration {

	
	public static void main(String[] args) {
		
	//	loopMapClassic();
	//	duplicateInArray();
		loopListJava8();
		
	}
	
	
	public static void loopListJava8() {

	      List<String> list = new ArrayList<>();
	      list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add("D");
	      list.add("E");

	       list.forEach(x -> System.out.println(x));

	      // method reference
	  //    list.forEach(System.out::println);
	  }
	
		public static void duplicateInArray() {
			int[] a = new int[] { 4, 4, 7, 8, 8, 9 };
			
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			
			for(int i =0; i<a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i],map.get(a[i])+1);
			}else {
				map.put(a[i],1);
			}	
			}
			System.out.println(map);
			// duplicate element in array
			System.out.println("duplicate element ");
			map.forEach(
					(k,v)->{
						if(v>1) {
							System.out.print(k+" ");
						}
					}
					);
			System.out.println();
			System.out.println("unique element ");
			//unique element
			map.forEach(
					(k,v)->{
						if(v==1) {
							System.out.print( k+ " ");
						}
					}
					);
			
		}
	
	
	 public static void loopMapClassic() {

	      Map<String, Integer> map = new HashMap<String, Integer>();
	      map.put("A", 10);
	      map.put("B", 20);
	      map.put("C", 30);
	      map.put("D", 40);
	      map.put("E", 50);
	      map.put("F", 60);

	      for (Map.Entry<String, Integer> entry : map.entrySet()) {
	          System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
	      }

	      map.forEach(
	    		  (k,v)->{
	    			  System.out.print("key is "+k);
	    			  System.out.print(" /value is "+v);
	    			  System.out.println();
	    		  }
	    		  );
	      
	  }
	
}
