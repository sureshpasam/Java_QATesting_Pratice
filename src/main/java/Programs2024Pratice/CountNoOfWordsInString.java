package Programs2024Pratice;

public class CountNoOfWordsInString {
    public static void CountWords() {

        String sentence = "Beauty lies in the eyes of beholder";
        int wordCount = 0;
        char[] ch = new char[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            ch[i] = sentence.charAt(i);
            if (((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0))) {
                wordCount++;
            }
        }
        System.out.println("The number of words in the string is: " + wordCount);

        String [] ss = sentence.split(" ");
        int count =0;
        for(String ss1 : ss){

            count ++;
        }
        System.out.println("count isss=====: " + count);

    }

    public static void SwappingTwoStrings(){
        String a = "suresh";
        String b = "pasam";
        System.out.println("Before Swapping "+a +"  "+b);
        a=a+b;

        b=a.substring(0,a.length()-b.length());//0,6
        a=a.substring(b.length());
        System.out.println("Before Swapping "+a +"  "+b);
    }


    public static void main(String[] args) {
       // CountNoOfWordsInString c = new CountNoOfWordsInString();
        CountWords();
        SwappingTwoStrings();
    }
}
