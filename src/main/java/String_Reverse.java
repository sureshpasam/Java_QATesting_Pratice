

import java.util.Arrays;

public class String_Reverse {

	public static void main(String[] args) {
		int n=10;
		String s = "sere suresh";
		StringBuilder sb = new StringBuilder(s);
			String replaceSs = sb.replace(1, 4, "ree").toString();
				
		System.out.println("ggg"+replaceSs+ "reverse+");
	for(int i =1; i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("s");
		}
		System.out.println();
	}

	}

}
