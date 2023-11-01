

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class AdpPratice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("suresh","pasam","lakshmi","suresh","ravi","pasam");
		Collections.sort(list);
		List<String> startwith =new ArrayList<String>();
		HashSet<String> finddup = new HashSet<String>();
		HashSet<String> finddup1 = new HashSet<String>();
		Map<String, Integer> counts = new HashMap<String, Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		//System.out.println("Duplicate elements"+finddup);

		for(String li:list) {
			if(li.startsWith("p")){
				startwith.add(li);
			}
			if(!finddup.add(li)) {
				finddup1.add(li);
			}
			if (counts.containsKey(li)) {
		        counts.put(li, counts.get(li) + 1);
		    } else {
		        counts.put(li, 1);
		    }
		}	
		System.out.println("Sorting "+list);
		System.out.println("duplicated"+finddup);
		System.out.println("duplicated"+finddup1);
		System.out.println("stat"+startwith);
		System.out.println("map "+counts);
		System.out.println("map==> "+map);
		Collections.sort(list);
	}

}
