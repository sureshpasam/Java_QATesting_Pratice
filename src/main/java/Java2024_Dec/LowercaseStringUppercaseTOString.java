package Java2024_Dec;

public class LowercaseStringUppercaseTOString {


    public static void strConvertLowerToUpperWithBuiltMethod(String input) {
        //Given a string of characters in lowercase convert that string to uppercase
        //without using inbuilt methods

        //ASCII Value of a-z = 97 to 122
        //ASCII Value of A-Z = 65 to 90

        char[] c = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]>='a' && c[i]<='z') {
                c[i] = (char) (c[i] - 32);
            }
        }

        System.out.println("String is converted to lowerTOUpper " + String.valueOf(c));
    }

    public static void UpperToLower(String input) {
        char[] c = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]>='A' && c[i]<='Z') {
                c[i] = (char) (c[i] + 32);
            }

        }
        System.out.println("String is converted to UpperToLower " + String.valueOf(c));

    }

    public static void main(String[] args) {

        strConvertLowerToUpperWithBuiltMethod("F");
        UpperToLower("SURESHs");

    }
}
