

public class RemoveDuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        String str1 = "suresh";
	        String str2 = "sureshlakshimi";
	       
	       /// System.out.println();
	        System.out.println(removeDuplicates1(str2));
	      
	    
	 
	   // private static String removeDuplicateChars(String sourceStr) {
	        // Store encountered letters in this string.
	        char[] chrArray = str1.toCharArray();
	        String targetStr1 = "";
	 
	        // Loop over each character.
	        for (char value : chrArray) {
	            // See if character is in the target
	            if (targetStr1.indexOf(value) == -1) {
	                targetStr1 += value; // Use StringBuilder as shown below
	            }
	        }
	       // return targetStr;
	        System.out.println(targetStr1);
	   // }
	}
	    private static String removeDuplicates1(String str) {
	        StringBuilder sb = new StringBuilder();
	        char[] arr = str.toCharArray();
	     
	        for (char ch : arr) {
	            if (sb.indexOf(String.valueOf(ch)) != -1)
	                continue;
	            else
	                sb.append(ch);
	        }
	        return sb.toString();
	}}


