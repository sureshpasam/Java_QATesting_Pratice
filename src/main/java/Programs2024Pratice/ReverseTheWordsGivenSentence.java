package Programs2024Pratice;

public class ReverseTheWordsGivenSentence {
    public void ReverseTheWordsGivenSentenceWithSB(String str) {
        String[] words = str.split("\\s");
        String revereW = "";
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            revereW += sb.toString() + " ";

        }
        System.out.println("Reverse of the given sentence with SB " + revereW);

    }

    public void ReverseTheWordsGivenSentenceWithoutSM(String str) {
        String[] words = str.split("\\s");
        String revereW = "";
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                revereW += word.charAt(i);
            }
        }
        System.out.println("Reverse of the given sentence without SB " + revereW);

    }

    public static void ReverseTheWordsGivenSentenceWithPreserveringSpace(String str) {
        char[] words = str.toCharArray();
        char[] revereW = new char[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i] == ' ') {
                revereW[i] = ' ';

            }

        }
        int j = revereW.length-1;
        for (int i=0;i<words.length;i++){
            if (words[i]!=' '){
                if (revereW[i] == ' ') {

                    j--;
                }
                revereW[j] =words[i];
                j--;
            }
        }
        System.out.println("Reverse with space::  " + String.valueOf(revereW));

    }

    public static void main(String[] args) {
        ReverseTheWordsGivenSentence rev = new ReverseTheWordsGivenSentence();
        rev.ReverseTheWordsGivenSentenceWithSB("Suresh Pasam Allur");
        rev.ReverseTheWordsGivenSentenceWithoutSM("Suresh Pasam");
        ReverseTheWordsGivenSentenceWithPreserveringSpace("Suresh Pasam");

    }
}
