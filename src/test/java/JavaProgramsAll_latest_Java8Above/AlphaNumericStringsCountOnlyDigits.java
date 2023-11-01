package JavaProgramsAll_latest_Java8Above;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphaNumericStringsCountOnlyDigits {
    String s1 = "jklmn4pjro5ops487";
    String sum="";
    /*str= str.replaceAll("[^0-9]+", " ");
               System.out.println(Arrays.asList(Integer.parseInt(str.trim())));
               List<Integer> li = (Arrays.asList(Integer.parseInt(str)));*/

    AlphaNumericStringsCountOnlyDigits(){
        for(int i = 0; i < s1.length() ; i++){
            if( Character.isAlphabetic(s1.charAt(i)) ){
                 sum = sum + s1.charAt(i);

            }
        }
        System.out.println("Printing only characters of the given string::"+sum);
    }
    public static void main(String[] args) {
        AlphaNumericStringsCountOnlyDigits al = new AlphaNumericStringsCountOnlyDigits();
        String s = "jklmn4pjro5ops487";
        int sum=0;
        //s= s.replaceAll("[^0-9]+", " ");
        // System.out.println(Arrays.asList(s.trim().split(" ")));
        //Logic 1
/*       for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
           if (Character.isDigit(temp)) {
               int b = Integer.parseInt(String.valueOf(temp));
                sum = sum + b;
           }
        }
        System.out.println(sum); */
// logic 2:: even number each digit count and each digit count
   /*     int sum = 0;
        int evenSum = 0;
        for (char c : s.replaceAll("\\D", "").toCharArray()) {
            int digit = c - '0';
            sum += digit;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
        }
        System.out.println(sum);
        System.out.println(evenSum);*/

   //Logic 3:: JUst no of digits count in sting

      /*  int count=0;
        for(int i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))){

                count++;
            }
        }
        System.out.println(count); */
// Logic 4::
       for(int i = 0; i < s.length() ; i++){
            if( Character.isDigit(s.charAt(i)) ){
                sum = sum + Character.getNumericValue(s.charAt(i));

            }
        }
        System.out.println("fourth logic::"+sum);
// logic 5::
    /*    for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                sum = sum + Integer.parseInt(s.charAt(i) + "");
            }
        }
        System.out.println(sum); */
// logic::6 using the regular expression the matcher class
//        Pattern pattern = Pattern.compile("[\\d]"); // Who do we appreciate!
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()) {
//            sum += Integer.parseInt(matcher.group());
//        }
//        System.out.println(sum);
    }
}


