package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class vowels {
    public void vowel(String input){
        int count =0;
        boolean status =false;
        for(char c :input.toLowerCase().toCharArray()){
            if(c == 'a' || c=='e' || c=='i' ||c=='o'||c=='u'){
                count ++;
               status=true;
            }
        }
        System.out.println("vowel:: "+status);
        System.out.println("vowel:: "+count);
    }
    public void vowelOccurence(String input){
      Map<Character,Integer> map = new HashMap<>();
        for(char c :input.toLowerCase().toCharArray()){
            if(c == 'a' || c=='e' || c=='i' ||c=='o'||c=='u'){
                if (map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                }
            }
        }
        for(Map.Entry<Character,Integer> nn : map.entrySet()){
            System.out.println("vowel:: "+nn.getKey()+" "+nn.getValue());

        }
        System.out.println("vowel:: "+map);
       // System.out.println("vowel"+count);


    }
    public static void main(String[] args){
        String s = "sureshPasam";
        vowels v = new vowels();
        v.vowel(s);
        v.vowelOccurence(s);


    }

}
