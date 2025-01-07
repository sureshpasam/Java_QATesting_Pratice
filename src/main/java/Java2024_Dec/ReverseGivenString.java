package Java2024_Dec;

public class ReverseGivenString {
    public static String rev(String input) {
        String rv = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rv += input.charAt(i);

        }
        return rv;
    }

    public static void StringlengthMethod(String input) {

        char[] c = input.toCharArray();
        int count = 0;
        for (char a : c) {
            count++;

        }
        System.out.println("" + count);
    }

    public static void reverseStringWithSamePlace(String input) {
        String fin = "";
        String[] arr = input.split(" ");


        for (String s : arr) {
            fin = fin + rev(s + " ");

        }
        System.out.println("=== " + fin);

    }


    public static void main(String[] args) {
        System.out.println("Reverse of the given string " + rev("suresh"));
        StringlengthMethod("Suresh");
        reverseStringWithSamePlace("Suresh Pasam");
    }

}
