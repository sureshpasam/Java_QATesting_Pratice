package JavaProgramsAll_latest_Java8Above;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ListOfJavaPrJavaTPoint {
    String s = "Suresh";
    StringBuilder sb = new StringBuilder(s);

    public void reverseMethodStrBuilderBuffer() {
        sb.reverse();
        System.out.println("Reverse of the given string is with String Builder concept::" + sb.toString());
    }

    public void reverseMethodIteration() {
        char[] ch = s.toCharArray();
        String Rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            Rev += ch[i];

        }
        System.out.println("Reverse of the given string is with Iteration Concept::" + Rev);
    }

    public boolean IsPalindrom(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if (str.equals(rev)) {
            System.out.println("Given string is palindrom:: " + rev);
            return true;
        } else {
            System.out.println("Given string is not palindrom::: " + rev);
            return false;
        }

    }

    public static String capitalizeEachFirstCharacterInWord(String str) {

        String[] words = str.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        System.out.println("Given string is not palindrom::: " + capitalizeWord.trim());
        return capitalizeWord.trim();

    }

    public static String reverseWord(String str) {
        String[] words = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }

    public static String reverseWordWithIteration(String str) {

        String[] words = str.split("\\s");
        String rev = "";
        for (String w : words) {
            char[] ch = w.toCharArray();
            for (int i = ch.length - 1; i >= 0; i--) {
                rev += +ch[i];
            }
        }
        return rev;
    }

    public static String WordFirstCharLowerAndRemainingCharUppertoggle(String str) {
        String[] words = str.split("\\s");
        String toggle = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            toggle += first.toLowerCase() + afterfirst.toUpperCase() + " ";
        }
        return toggle.trim();
    }

    public static String reverseToggleWordAndFirstCharIsLowerCaseRemaingUpperCase(String str) {
        String[] words = str.split("\\s");
        String reverseToggle = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            String first = sb.substring(0, 1);
            String afterfirst = sb.substring(1);
            reverseToggle += first.toLowerCase() + afterfirst.toUpperCase() + " ";
        }
        return reverseToggle.trim();
    }

    public static void internMethodExample() {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1 == s2);//false because reference variables are pointing to different instance
        //System.out.println(s1.equals(s2));//false because reference variables are pointing to different instance
        System.out.println(s2 == s3);//true because reference variables are pointing to same instance
    }

    public static void StrTOIntConversion() {
        //Declaring String variable
        String s = "200";
        //Converting String into int using Integer.parseInt()
        int i = Integer.parseInt(s);
        //Printing value of i
        System.out.println(i);
        System.out.println(Integer.valueOf(s));
    }

    public static void IntToStringConversion() {
        int i = 200;
        String s = String.valueOf(i);
        System.out.println(i + 100);//300 because + is binary plus operator
        System.out.println(s + 100);//200100 because + is string concatenation operator
        System.out.println(Integer.toString(i));// another method
    }

    public static void StrTODate() throws ParseException {
        String sDate1 = "02/07/2020";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(sDate1 + "\t" + date1);
    }
    static void isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    static void charPercentage(String input) {
        int totalChar = input.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            }
            else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else {
                others++;
            }
        }
        double upperCaseLetterPercentage = (upperCase * 100) / totalChar;
        double lowerCaseLetterPercentage = (lowerCase * 100) / totalChar;
        double digitsPercentage = (digits * 100) / totalChar;
        double otherCharPercentage = (others * 100) / totalChar;

        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println("In '" + input + "' : ");
        System.out.println("Uppercase letters are " + format.format(upperCaseLetterPercentage) + "% ");
        System.out.println("Lowercase letters are " + format.format(lowerCaseLetterPercentage) + "%");
        System.out.println("Digits Are " + format.format(digitsPercentage) + "%");
        System.out.println("Other Characters Are " + format.format(otherCharPercentage) + "%");

    }

    public static void DuplicateCharFinder(String str){
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for (Character c:ch){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else {
                map.put(c,1);
            }
        }
        System.out.println("Characters are removed in the string::"+map);
        Set<Character> set = map.keySet();
        for (Character setKeys: set){
            if(map.get(setKeys)>1){
                System.out.println(setKeys + "  is::: " + map.get(setKeys) + " times");
            }
        }
    }
    public static void removeSpaceINString() {
        String str = "India     Is My    Country";
        //1st way
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method
        System.out.println(noSpaceStr);
        //2nd way
        char[] strArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr2 = stringBuffer.toString();
        System.out.println(noSpaceStr2);
    }

    public static void reverseStringReverseOrderOfTheString(String input) {

        char[] inputArray = input.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = result.length - 1;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(input + " --> " + String.valueOf(result));
    }



    public static void main(String[] args) throws ParseException {
        ListOfJavaPrJavaTPoint l = new ListOfJavaPrJavaTPoint();
        /*l.reverseMethodStrBuilderBuffer();
        l.reverseMethodIteration();
        l.IsPalindrom("nitin");
        l.IsPalindrom("amma");
        l.IsPalindrom("NAN");
        l.IsPalindrom("Sure"); */
        capitalizeEachFirstCharacterInWord("pasam suresh is software engineer");
        // System.out.println("Reverse of the given each word of the string::"+reverseWord("pasam suresh is software engineer"));
        //System.out.println("Reverse of the given each word of the string::"+reverseWordWithIteration("pasam suresh is software engineer"));
        System.out.println("Reverse of the given each word of the string::" + WordFirstCharLowerAndRemainingCharUppertoggle("pasam suresh is software engineer"));
        System.out.println("Reverse of the given each word of the string::" + reverseToggleWordAndFirstCharIsLowerCaseRemaingUpperCase("pasam suresh is software engineer"));
        internMethodExample();
        StrTOIntConversion();
        IntToStringConversion();
        StrTODate();
        isAnagram("keep","peek");
        charPercentage("Sureshpasam");
        DuplicateCharFinder("Pasam suresh");
        removeSpaceINString();
        reverseStringReverseOrderOfTheString("Suresh Pasam");

    }
}
