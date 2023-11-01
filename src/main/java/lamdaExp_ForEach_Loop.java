

import java.util.ArrayList;
import java.util.List;

public class lamdaExp_ForEach_Loop {
	public static void draw() {
		System.out.println("Hello, Suresh how are you");	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<String> list = new ArrayList<>();
		list.add("Suresh");
		list.add("RAvi");
		list.add("Raju");
		list.add("Ramesh");
		list.add("Rajendra");
		list.add("Suri");

	list.forEach((n)->System.out.println("List values are::"+n));
		 */
		//lamda ss =lamdaExp_ForEach_Loop()::method;
		//ss.say("suresh");
		lamda lam = (msg)->{
			String str1 = "I love";
			String str2 = str1 + msg;
			return str2;	
		};
		System.out.println(lam.say(" my India"));
// referrring the static method
		Drawable a = lamdaExp_ForEach_Loop ::draw;
		a.draw();
	}}
