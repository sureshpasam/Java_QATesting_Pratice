

import java.util.HashSet;

public class ReverseWithOutRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "suresh";
		 String rev = "";
		HashSet<Character> set = new HashSet<>();
		 for(int i=s.length()-1;i>=0;i--) {
			 rev+=s.charAt(i);
			 set.add(s.charAt(i));
		 } 
		 System.out.println("reverse of the string:::"+rev);
		 System.out.println("reverse of the string:::"+set);	
	}

}
