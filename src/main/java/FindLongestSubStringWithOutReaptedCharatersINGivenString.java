

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class FindLongestSubStringWithOutReaptedCharatersINGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convert inputString to charArray

		String inputString = "javaconceptoftheday" ; 

		char[] charArray = inputString .toCharArray();

		//Initialization

		String longestSubstring = null;

		int longestSubstringLength = 0;
		HashSet<Character> set = new HashSet<>();
		
		
		for(Character cc:charArray) {
			set.add(cc);
			
		}
		System.out.println("set values"+set );

		//Creating LinkedHashMap with characters as keys and their position as values.

		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();

		//Iterating through charArray

		for (int i = 0; i < charArray.length; i++) 
		{
			char ch = charArray[i];

			//If ch is not present in charPosMap, adding ch into charPosMap along with its position

			if(!charPosMap.containsKey(ch))
			{
				charPosMap.put(ch, i);
			}

			//If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap

			else
			{   
				i = charPosMap.get(ch);

				charPosMap.clear();
			}

			//Updating longestSubstring and longestSubstringLength

			/*if(charPosMap.size() > longestSubstringLength)
			{
				longestSubstringLength = charPosMap.size();

				longestSubstring = charPosMap.keySet().toString();
			}*/
		}

		System.out.println("Input String : "+inputString);

		System.out.println("The longest substring : "+charPosMap.keySet().toString());

		System.out.println("The longest Substring Length : "+charPosMap.size());


	}}
