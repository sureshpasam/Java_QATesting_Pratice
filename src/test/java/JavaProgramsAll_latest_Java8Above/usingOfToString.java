package JavaProgramsAll_latest_Java8Above;

public class usingOfToString {
	String mobile;
	static String name;
	static String Address;

	public usingOfToString(String string,String name,String Address) {
		
		this.mobile=string;
		this.name=name;
		this.Address=Address;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return mobile+" "+name +" "+Address +" ";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		usingOfToString u = new usingOfToString("9703533394", "Suresh", "Allur");
		System.out.println("Data is::"+u);

	}

}
