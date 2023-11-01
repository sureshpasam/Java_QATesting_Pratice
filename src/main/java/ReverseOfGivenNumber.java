

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ReverseOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234, reversed = 0;
		int n=1000;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
	
	
	
		if(n%2==0) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	
		HashMap<String, String> map = new LinkedHashMap<>();
	

}}
