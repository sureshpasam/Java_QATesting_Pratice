package Collection_Examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Endows_StringHappyashappy {
    public static void main(String[] args) {
        String s = "happyashappyhappy";
        String[] words = s.split("happy");
int count =0;
for (int i =0;i<s.length();i++){
    if(s.matches("happy")){
        count++;
    }
}

    }


}
