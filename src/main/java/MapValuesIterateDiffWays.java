package RestAssured_Pratice.RestApi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class MapValuesIterateDiffWays {

	@SuppressWarnings({ "unlikely-arg-type", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Suresh");
		map.put(2, "Lakshmi");
		map.put(3, "Hyma");
		map.put(4, "ChenchuRam");
		map.put(5, "Kondamma");
		map.put(6, "Dhana");
		
		// Old way to iterating the map values
		
		Set set=map.entrySet();//Converting to Set so that we can traverse
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry1=(Map.Entry)itr.next();  
	        System.out.println(entry1.getKey()+" "+entry1.getValue());  
	    }
		//Method 1 iterate MAP With EntrySet

		Iterator<Entry<Integer, String>> entrySet = map.entrySet().iterator();

		while (entrySet.hasNext())
		{
			Entry<Integer, String> entry = entrySet.next();

			System.out.println("Method 1 Key : "+entry.getKey()+"   Value : "+entry.getValue());

		}
		System.out.println("##### Method 1 Completed ###@@");

		//Method 2 with KeySet
		Iterator<Integer> keySetIterator = map.keySet().iterator();

		while (keySetIterator.hasNext())
		{
			Object key = keySetIterator.next();

			System.out.println("Method 2 Key : "+key+"   Value : "+map.get(key));
		}

		System.out.println("##### Method 2 Completed ###@@");
		// Method 3 For Each for Entry Set

		Set<Entry<Integer, String>> entrySet1 = map.entrySet();

		for(Entry<Integer, String> entry : entrySet1)
		{
			System.out.println("Method 3 Key : "+entry.getKey()+"   Value : "+entry.getValue());
		}

		// or another Way

		for (Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println("Method 3 Key : "+m.getKey()+"   Value : "+m.getValue());
		}

		// Method 4 For Each KeySet

		Set<Integer> keySet = map.keySet();

		for(Integer key : keySet)
		{
			System.out.println("Key : "+key+"   Value : "+map.get(key));
		}

		// or Another Way

		for(Integer key:map.keySet()) {
			System.out.println("Key : "+key+"   Value : "+map.get(key));
		}

		// Method 5 using Java 8

		map.forEach((k,v)->System.out.println("Java 8 Key is:: " + k +" Value is:: "+ v));

		//or EntrySet interface also java8

		map.entrySet().forEach((entry) -> {
			System.out.println("Key : "+entry.getKey()+"   Value : "+entry.getValue());
		});
		map.keySet().forEach((key)->System.out.println("Key is## ::"+key +" Value##:;"+map.get(key)));
		// with Streams
		
		Stream.of(map.entrySet()).forEach((entry)->System.out.println(entry));
		
		Stream.of(map.keySet()).forEach((k)->System.out.println("keyDDDDD::"+k+"   Value is:: "+map.get(k)));
		
		// Another Way
		  map.entrySet().iterator().forEachRemaining(entry-> 
          System.out.println("Key111 : "+entry.getKey()+"   Value111 : "+entry.getValue()));
		  
		  map.keySet().iterator().forEachRemaining((key)->System.out.println("key is###:"+key+"Value is ###"+map.get(key)));
		  
		  map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).forEach(System.out::println);
		  map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		  map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		  map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}
}

