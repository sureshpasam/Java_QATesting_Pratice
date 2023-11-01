package Collection_Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
	
	
	public void hashMapex() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "Suresh");
		map.put(1002, "lakshmi");
		map.put(1003, "Chaitu");
		Iterator<Integer> it =map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Key:: "+key +" Value:: "+map.get(key));
		}
	}
	
	public void hashMapValuesAndKeySet() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "Suresh");
		map.put(1002, "lakshmi");
		map.put(1003, "Chaitu");
		
		for(Integer it:map.keySet()) {
			
			System.out.println("List of the keys:: "+it);
			
		}
		for(String value:map.values()) {
			System.out.println("List of the values:: "+value);
		}
		
	}
	public void hashMapEntrySett() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "Suresh");
		map.put(1002, "lakshmi");
		map.put(1003, "Chaitu");
		
		for(Map.Entry en: map.entrySet()) {
			System.out.println("Key entry set:: "+en.getKey()+" Value entry set::"+en.getValue());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapExample map = new HashMapExample();
		map.hashMapex();
		map.hashMapValuesAndKeySet();
		map.hashMapEntrySett();

	}

}
