

import java.util.Scanner;

public class StringWordsNoOfCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Suresh India Suresh India";
		
//		String [] wordsCount  = words.trim().split(" ");
//		System.out.println("count is::"+wordsCount.length);
		
//		System.out.println("Enter the string");
//
//        Scanner sc = new Scanner(System.in);
//
//        String s=sc.nextLine();
 
        int count = 1;
 
        for (int i = 0; i < s.length()-1; i++)
        {
        	boolean b = s.charAt(i) == ' ';
        	boolean b1 =s.charAt(i+1) != ' ';
        	int  ff =s.charAt(i+1);
        	
            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
            {
                count++;
            }
        }
 
        System.out.println("Number of words in a string = "+count);
    }

	}


