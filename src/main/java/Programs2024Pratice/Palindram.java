package Programs2024Pratice;

public class Palindram {
    public static boolean pali(String s) {
        String rev = "";
        char[] ch = s.toCharArray();
        for (int i = s.length()-1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse of the string " + rev);


        if (rev.equals(s)) {
            System.out.println("Given string is palidrom " + rev);
            return true;
        } else {
            System.out.println("Given string is not palidrom " + rev);
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(Palindram.pali("oyo"));
    }
}
