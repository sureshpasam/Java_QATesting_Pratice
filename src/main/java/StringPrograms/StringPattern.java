package StringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPattern {
    public static void main(String[] args) {
        String s = " I have [HDFC] Bank [Credit] Card";
        Pattern pattern = Pattern.compile("\\[(.*?)]");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

    }
}


