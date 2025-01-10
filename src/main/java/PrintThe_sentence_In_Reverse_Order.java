

public class PrintThe_sentence_In_Reverse_Order {

	public static  String rev (String in){
		String rev = "";
		char [] c = in.toCharArray();
		for(int i=in.length()-1 ;i>=0;i--) {

			rev+=in.charAt(i);

		}
		return  rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String revv="";
		
		String s = "Auto generated method stub";
		String[] ss = s.split(" ");
		for (String s1:ss) {
			revv +=rev(s1 +" ");

		}
		System.out.println("REVVVVVVVVVVVVVVVVVV"+revv.toString());



	}

}
