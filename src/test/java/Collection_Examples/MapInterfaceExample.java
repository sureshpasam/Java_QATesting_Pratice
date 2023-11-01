package Collection_Examples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceExample {
	public void mapExample() {
		 Map map=new HashMap();  
		    //Adding elements to map  
		    map.put(1,"Amit");  
		    map.put(5,"Rahul");  
		    map.put(2,"Jai");  
		    map.put(6,"Amit"); 
		    map.put(1,"suresh"); 
		    Set<String> set = map.entrySet();
		    Iterator it =set.iterator();
		    while(it.hasNext()) {
		    	Map.Entry entry=(Map.Entry)it.next();  
		    	System.out.println(entry.getKey()+" "+entry.getValue());  
		    	
		    }
	}
	
	public void mapExampleNewStyle() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit"); 
	    map.put(1,"suresh"); 
	    for(Map.Entry<Integer, String> en:map.entrySet()) {
	    	System.out.println("Key:: "+en.getKey() +"  Value:: "+en.getValue());
	    }
	    	
	}
	public void comparingByKey() {
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul"); 
	      
	      map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
	
	public void comparingByKey_ReverseOrder() {
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul"); 
	      
	      map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapInterfaceExample map = new MapInterfaceExample();
		map.mapExample();
		map.mapExampleNewStyle();
		map.comparingByKey();
		map.comparingByKey_ReverseOrder();

	}

}

