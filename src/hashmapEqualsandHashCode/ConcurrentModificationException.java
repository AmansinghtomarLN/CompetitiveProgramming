package hashmapEqualsandHashCode;

import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();	
        hm.put(1, 1);
        hm.put(2,22);
        hm.put(3,  33);
        hm.put(4, 44);
         
Iterator it=hm.keySet().iterator();
while(it.hasNext()){
    int value=(int) it.next();
    if(value==3){
      hm.put(5, 555);   //throws ConcurrentModificationException
    }
	}
	
}
}