

import java.util.StringJoiner;

public class stringJoiner {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner joiner = new StringJoiner(",");// Delimeter added for comma (,)
		// adding values to the String joiner
		
		joiner.add("Suresh");
		joiner.add("Pasam");
		joiner.add("Lakshmi");
		joiner.add("Pasam");
		System.out.println("Adding delimeter with comma(,):::"+joiner);
		
		StringJoiner joiner1 = new StringJoiner(",","[","]");
		joiner1.add("Suresh");
		joiner1.add("Pasam");
		joiner1.add("Lakshmi");
		joiner1.add("Pasam");
		System.out.println("Adding delimeter with comma(,)and prifix and suffix []:::"+joiner1);
		
		StringJoiner joiner2 = joiner.merge(joiner1);
		System.out.println("Mergging two String joiners::::"+joiner2);
		
	}

}
