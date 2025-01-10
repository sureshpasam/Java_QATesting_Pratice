
import java.util.HashMap;

public class lastRepeatedAndNon_Repeated_Characters {
	 public static void getCharacter(String input){
	        //remove all the spaces
	        input = input.replaceAll(" ", "");
	        Character rptChar = null;
	        Character nrptChar = null;
	        //Will store each character and it's count
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        for (int i = 0; i <input.length(); i++) {
	            Character chr = input.charAt(i);
	            if(map.containsKey(chr)){
	                map.put(chr,map.get(chr)+1);
	            }else{
	                map.put(chr, 1);
	            }
	        }

	        //Iterate the string from end to start and return the character for which the count is > 1 in map
	        for (int i = input.length()-1; i >=0 ; i--) {
	            if(map.get(input.charAt(i))>1){
	                rptChar = input.charAt(i);
	                break;
	            }
	        }
	        System.out.println("First Repeating Character in '"+input+"' is: " + rptChar);
	        
	        for (int i = input.length()-1; i >=0 ; i--) {
	            if(map.get(input.charAt(i))==1){
	                nrptChar = input.charAt(i);
	                break;
	            }
	        }
	        System.out.println("Last non Repeating Character in '"+input+"' is: " + nrptChar);
	    }
	
	    public static void main(String[] args) {
	        String input = "suresh";
	       getCharacter(input);
	        
	    }
}
