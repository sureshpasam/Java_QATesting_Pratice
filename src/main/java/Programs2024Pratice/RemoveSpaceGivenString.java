package Programs2024Pratice;

public class RemoveSpaceGivenString {

    public static void CountWords()

    {
        String sentence = "Beauty lies in the eyes of beholder";
        String[] s = sentence.split("//s");
        int wordCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordCount++;
            }
        }
        System.out.println("The number of words in the string is: " + wordCount);
    }


    public static void main(String[] args) {
        String str = "India     Is My    Country";
        //1st way
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method
        System.out.println(noSpaceStr);


        //2nd way
        char[] strArray = str.toCharArray();
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr2 = stringBuffer.toString();
        System.out.println(noSpaceStr2);

        CountWords();
    }


}
