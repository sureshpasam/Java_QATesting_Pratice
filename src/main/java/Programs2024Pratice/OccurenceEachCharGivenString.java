package Programs2024Pratice;

import junit.swingui.MacProgressBar;
import org.apache.commons.collections4.map.HashedMap;

import java.util.Map;
import java.util.Set;

public class OccurenceEachCharGivenString {

    public static void duplicate(String input) {

        char[] c = input.toCharArray();
        Map<Character, Integer> map = new HashedMap<>();

        for (Character ch : c) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println("" + map);

        Set<Character> set = map.keySet();
        for (Character cc : set) {
            if (map.get(cc) > 1) {
                System.out.println("Character ::" + cc + " value " + map.get(cc));
            } //else {
               // System.out.println("Character ::" + cc + " value " + map.get(cc));
           // }
        }
    }

    public static void main(String [] args){
        duplicate("sureshpasam");

    }
}
