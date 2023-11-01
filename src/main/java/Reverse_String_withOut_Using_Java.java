
public class Reverse_String_withOut_Using_Java {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "Suresh", reverse = "";

		//  System.out.println("Reverse::"+original);
		int j =0;
		for (char c :original.toCharArray()) {
			j++;
		}
		System.out.println("String length::"+j);

		int length = original.length();

		for (int i = length - 1 ; i >= 0 ; i--) {
			reverse = reverse + "*"+original.charAt(i);
		}
		System.out.println("Reverse of the string: " +reverse);	
	}}



