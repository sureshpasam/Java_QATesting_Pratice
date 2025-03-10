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
//        Set<Character> set = baseMap.keySet();
        for (char c : ch) {
            if (baseMap.get(c) > 1) {
                System.out.println("Char is duplicate:: " + c + " -" + baseMap.get(c) + " Times");
            } else {
                System.out.println("Char is ::" + c + "- " + baseMap.get(c) + " Times");

            }
        }
//
//        }

        System.out.println(" Times" + baseMap);

    }


    public static void main(String[] args) {
        findDupliacateCharactersInString f = new findDupliacateCharactersInString("sureshpasam");

    }
}
