
import java.util.HashMap;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sureshlakshmi";
		HashMap<Character, Integer> map = new HashMap<>();
		char[] c =s.toCharArray();
		for(Character c1 :c) {
			if(map.containsKey(c1)) {
				map.put(c1, map.get(c1)+1);
			}else {
				map.put(c1, 1);
			}
		}
		System.out.println("Given string each charcter count ::"+map);
		

	}

}
