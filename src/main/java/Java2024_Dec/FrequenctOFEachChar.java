package Java2024_Dec;

public class FrequenctOFEachChar {

    // Each character frequency for with HashMap
    
    public static void FreqenctOfEachChar(String input){

        char[] arr = input.toCharArray();
        int[] fr = new int[arr.length];

        int visited = -1;
        int count;

        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }

        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited) {
                System.out.println(arr[i] + "-->" + fr[i]);
            }
        }

    }
        

    
    public static void main (String [] args){
    FreqenctOfEachChar("sureshpasam");

    }
    
}
