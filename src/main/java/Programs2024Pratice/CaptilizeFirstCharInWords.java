package Programs2024Pratice;

public class CaptilizeFirstCharInWords {

    CaptilizeFirstCharInWords(String s) {
        String[] words = s.split("\\s");
        String capUW = " ";
        for (String w : words) {
            String fcharword = w.substring(0, 1);
            String afterFirChar = w.substring(1);
            capUW+=fcharword.toUpperCase()+afterFirChar;
        }
        System.out.println("Captilized the each word of the Fitst Char "+capUW);
    }

    public void CaptilizeLasttCharInWords(String s) {
        String[] words = s.split("\\s");

        String capUW = " ";
        for (String w : words) {
            String fcharword = w.substring(w.length()-1);
            String afterFirChar = w.substring(0,w.length()-1);
            capUW+=afterFirChar+fcharword.toUpperCase();
        }
        System.out.println("Captilized the each word of the Fitst Char "+capUW +" "+words.length) ;
    }


    public static void main(String[] args) {
        CaptilizeFirstCharInWords cap = new CaptilizeFirstCharInWords("suresh");

        cap.CaptilizeLasttCharInWords("suresh pasam Allur");

    }
}
