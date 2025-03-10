package StringPrograms;

public class StringConvertoupperLowerBasedonChar {


    public void approch1(String input) {
        StringBuilder output = new StringBuilder();

        for (char c :input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                output.append(Character.toLowerCase(c));
            } else {
                output.append(Character.toUpperCase(c));
            }
        }
        System.out.println("StringconverttoLowerUpper:: "+output.toString());
    }

    public void approch2(String input){
        StringBuilder output = new StringBuilder();

        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check character range and switch case
            if (ch >= 'A' && ch <= 'Z') { // Uppercase letter
                output.append((char)(ch + 32)); // Convert to lowercase
            } else if (ch >= 'a' && ch <= 'z') { // Lowercase letter
                output.append((char)(ch - 32)); // Convert to uppercase
            } else {
                // If it's not a letter, just append it as is
                output.append(ch);
            }
        }
        System.out.println("StringconverttoLowerUpper:: "+output.toString());

    }

        public static void main(String[] args){
            String input = "SuRe";
            StringConvertoupperLowerBasedonChar lu = new StringConvertoupperLowerBasedonChar();
            lu.approch1(input);
            lu.approch2(input);
        }

}
