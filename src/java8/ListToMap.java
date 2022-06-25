package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToMap {

	public static void main(String[] args) {

		List<Hoisting> list = new ArrayList<>();
		list.add(new Hoisting(1, "liquidweb.com", 80000));
		list.add(new Hoisting(2, "linode.com", 90000));
		list.add(new Hoisting(3, "digitalocean.com", 120000));
		list.add(new Hoisting(4, "aws.amazon.com", 200000));
		list.add(new Hoisting(5, "mkyong.com", 1));

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				

//		filter()
//		findAny()
//		findElse()
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				

		// key = id, value - websites

//		Map<Integer, String> map1 = list.stream().collect(Collectors.toMap(Hoisting::getId, Hoisting::getName));
//		Map<Integer, String> result3 = list.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));

		// duplicate key
		Map<Integer, String> map1 = list.stream().collect(Collectors.toMap(
				Hoisting::getId, Hoisting::getName, // key = id & value = name
				(oldValue, newValue) -> oldValue) // if same key, take the old key
		);

		map1.forEach((k, v) -> System.out.println(k + ":" + v));

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		
		Set<String> s  = 	list.stream().map(x->x.getName())
				.collect(Collectors.toSet());
		
		System.out.println(s);
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
			list.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
		list.forEach(x->System.out.println(x));
		
		
	}

}










