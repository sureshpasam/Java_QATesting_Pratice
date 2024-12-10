

public class StringCheck {
	public static void main(String[] args) {
	      String[] input = {
	            "suresh",
	            "9sure",
	            "352",
	            "5gsure",
	            "-86",
	            "6.7"
	         };
	 
	         // Loop through an array of Strings,
	         // testing if each is a integer or not
	 
	         for (int i=0; i<input.length; i++) {
	 
	            // Test if next string is a integer
	            boolean isInteger = isInteger(input[i]);

	            if (isInteger) {
	               System.out.println(input[i]+" is an integer");
	            } else {
	               System.out.println(input[i]+" is not an integer");
	            }
	         }

	         
	   }
	 
	   public static boolean isInteger(String s) {
	      boolean isValidInteger = false;
	      try
	      {
	    	  
	         Integer.parseInt(s);
	 
	         // s is a valid integer
	 
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         // s is not an integer
	      }
	 
	      return isValidInteger;
	   }
}
