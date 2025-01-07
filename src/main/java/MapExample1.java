

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "suresh");
	map.put(2, "suresh");
	
	Set set = map.entrySet();
	 Set s  = map.keySet();
	Iterator itt = s.iterator();
	while(itt.hasNext()) {
		itt.next();
		
		String ss =map.get(1);
		System.out.println("asdasda"+ss);
	}
	
	Iterator it = set.iterator();
	
	while(it.hasNext()) {

		Map.Entry<Integer, String> m =(Entry<Integer, String>)it.next();
		System.out.println("key is "+m.getKey() +" Value is "+m.getValue());
	}
	
	}

}
