package RestAssured_Pratice.RestApi;

import java.util.HashMap;

public class FirstRepeatedNonRepeatedCharactersInString {
	 static void firstRepeatedNonRepeatedChar(String inputString)
	    {
	        //Creating a HashMap containing char as a key and occurrences as a value
	         
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	         
	        //Converting inputString to char array
	         
	        char[] strArray = inputString.toCharArray();
	         
	        //Checking each char of strArray
	         
	        for (char c : strArray)
	        {
	            if(charCountMap.containsKey(c))
	            {
	                //If char is present in charCountMap, incrementing it's count by 1
	                 
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                //If char is not present in charCountMap,
	                //adding this char in charCountMap with 1 as it's value
	                 
	                charCountMap.put(c, 1);
	            }
	        }
	         
	        //checking for first non-repeated character
	         
	        for (char c : strArray)
	       
	        {
	            if (charCountMap.get(c) == 1)
	            {
	                System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
	                 
	                break;
	            }
	        }
	         
	        //checking for first repeated character
	         
	        for (char c : strArray)
	        {
	            if (charCountMap.get(c) > 1)
	            {
	                System.out.println("First Repeated Character In '"+inputString+"' is '"+c+"'");
	                 
	                break;
	            }
	        }
	        
	        for (int i = inputString.length()-1; i >=0 ; i--) {
	            if(charCountMap.get(inputString.charAt(i))>1){
	                Character rptChar = inputString.charAt(i);
	                System.out.println("Last Repeating Character in '"+inputString+"' is: " + rptChar);
	                break;
	            }
	        }
	        
	        
	        for (int i = inputString.length()-1; i >=0 ; i--) {
	            if(charCountMap.get(inputString.charAt(i))==1){
	                Character nrptChar = inputString.charAt(i);
	                System.out.println("Last non Repeating Character in '"+inputString+"' is: " + nrptChar);
	                break;
	            }
	        }
	        
	    }
	    
	     
	    public static void main(String[] args)
	    {
	        String input ="suresh";
	         
	        firstRepeatedNonRepeatedChar(input);
	    }
	}


