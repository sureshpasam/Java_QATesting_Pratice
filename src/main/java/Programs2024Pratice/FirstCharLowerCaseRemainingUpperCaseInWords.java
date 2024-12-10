package Programs2024Pratice;

public class FirstCharLowerCaseRemainingUpperCaseInWords {

    FirstCharLowerCaseRemainingUpperCaseInWords(String s) {
        String[] words = s.split("\\s");
        String capUW = "";
        for (String w : words) {
            String fcharword = w.substring(0, 1);
            String afterFirChar = w.substring(1);
            capUW+=fcharword.toLowerCase()+afterFirChar.toUpperCase();
        }
        System.out.println("Captilized the each word of the Fitst Char "+capUW);
    }

    public void CaptilizeLasttCharInWords(String s) {
        String[] words = s.split("\\s");
        String capUW = "";
        for (String w : words) {
            String fcharword = w.substring(w.length()-1);
            String afterFirChar = w.substring(0,w.length()-1);
            capUW+=afterFirChar.toUpperCase()+fcharword.toLowerCase();
        }
        System.out.println("Captilized the each word of the Fitst Char "+capUW);
    }


    public static void main(String[] args) {
        FirstCharLowerCaseRemainingUpperCaseInWords cap = new FirstCharLowerCaseRemainingUpperCaseInWords("suresh pasam ");

        cap.CaptilizeLasttCharInWords("suresh pasam Allur");

    }
}
