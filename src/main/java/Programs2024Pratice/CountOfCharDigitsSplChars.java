package Programs2024Pratice;

public class CountOfCharDigitsSplChars {
    CountOfCharDigitsSplChars(String s) {
        int totalInput = s.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int other = 0;
        //char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCase++;
            } else if (Character.isLowerCase(c)) {
                lowerCase++;

            } else if (Character.isDigit(c)) {
                digits++;

            } else {
                other++;
            }
        }
        System.out.println("Total no of upper cases::" + upperCase);
        System.out.println("Total no of lower cases::" + lowerCase);
        System.out.println("Total no of Digits::" + digits);
        System.out.println("Total no of other characters " + other);

        System.out.println("Total Percentage of the Upper cases Letter::" + (upperCase*100)/totalInput);

    }

    public static void main(String[] args) {
        CountOfCharDigitsSplChars c = new CountOfCharDigitsSplChars("SureshPasam100@%%1234 ++ L");
    }
}
