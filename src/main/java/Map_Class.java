

import java.util.Arrays;
import java.util.HashMap;

public class Map_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Integer [] va = {1,5,6,8,10,12,15};
       Arrays.sort(va);
       for(int i = va.length-1;i>=0;i--) {
    	   System.out.println("values are:::"+va[i]);
       }
		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "Suresh");
		map.put(5, "Ravi");
		map.put(5, "Ramaesh");
		map.put(5, "Ramu");
		map.put(5, "RAgh");
		map.put(5, "Sure");
		System.out.println("Map values is::"+map);
	}

}
