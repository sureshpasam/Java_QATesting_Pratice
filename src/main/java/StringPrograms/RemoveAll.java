package StringPrograms;

public class RemoveAll {
    String s = "sureshpasam";

    public void addSpaceBetweenSentence() {
        System.out.println("" + String.valueOf(s).replaceAll(".", "$0 "));
        System.out.println("" + String.valueOf(s).replaceAll(".(?!$)", "$0 "));
        System.out.println("" + s.replaceAll("([a-z])", "$1 "));
        String s1 ="SureshPasam";
        System.out.println("" + s1.replaceAll("([A-Z])", " $0"));
        String s2 ="SUREShPASAm";
        System.out.println("" + s2.replaceAll("([a-z])", "$1 "));
        String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
        String regex = "(?i)cat";
        System.out.println(myStr.replaceAll(regex, "dog"));
        String myStr1 = "Quest complete! Earned 30 gold and 500 experience.";
        String regex1 = "[0-9]+";
        System.out.println(myStr1.replaceAll(regex1, "($0)"));

             String input = "Hello w o r l d";
             String result = input.replaceAll("\\s", "_");
                System.out.println(result);

                //op- Hello_w_o_r_l_d

        String result1 = input.replaceAll("e.*o", "X");
        System.out.println(result1);
        //op HX r l d

        /*
        String input = "hi.java.hi.world";

String result = input.replaceAll("\\.", ":");
assertEquals("hi:java:hi:world", result);

result = input.replaceAll("[.]", ":");
assertEquals("hi:java:hi:world", result);
         */

        /*
        String str1 = "Java123is456fun";

    // regex for sequence of digits
    String regex = "\\d+";

    // replace all occurrences of numeric
    // digits by a space
    System.out.println(str1.replaceAll(regex, " "));
    o/p" Java is fun
         */



        StringBuilder sb = new StringBuilder();
        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
                sb.append(" ");
            }
        }
        System.out.println("" + sb);

    }

    public static void main(String[] args) {
        RemoveAll r = new RemoveAll();
        r.addSpaceBetweenSentence();


    }
}
