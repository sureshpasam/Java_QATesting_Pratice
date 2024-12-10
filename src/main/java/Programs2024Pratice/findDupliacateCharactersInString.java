package Programs2024Pratice;

import org.apache.commons.collections4.map.HashedMap;

import java.util.Map;
import java.util.Set;

public class findDupliacateCharactersInString {
    findDupliacateCharactersInString(String s) {
        Map<Character, Integer> baseMap = new HashedMap<>();
        char[] ch = s.toCharArray();
        for (Character c : ch) {
            if (baseMap.containsKey(c)) {
                baseMap.put(c, baseMap.get(c) + 1);

            } else {
                baseMap.put(c, 1);
            }

        }
        Set<Character> set = baseMap.keySet();
        for (Character ch1 : set) {
            if (baseMap.get(ch1) > 1) {
                System.out.println("Char is duplicate:: " + ch1 + " -" + baseMap.get(ch1) + " Times");
            } else {
                System.out.println("Char is ::" + ch1 + "- " + baseMap.get(ch1) + " Times");

            }

        }

    }

    public static void main(String[] args) {
        findDupliacateCharactersInString f = new findDupliacateCharactersInString("sureshpasam");

    }
}
