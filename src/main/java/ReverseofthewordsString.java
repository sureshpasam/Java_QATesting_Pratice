

public class ReverseofthewordsString {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I love my india";
		String[] words =s.split(" ");
		
		String rString="";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String rWord="";
			for(int j=word.length()-1;j>=0;j--) {

				rWord=rWord+word.charAt(j);	
			}
			rString =rString+rWord+ " ";
		}
		System.out.println("Reverse of the String words::"+rString);
	}

}
