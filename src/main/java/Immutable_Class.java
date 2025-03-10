



public class Immutable_Class {
	
	private String pancard;
	
	public Immutable_Class(String pancard) {
		this.pancard =pancard;
		
	}
	public String getpanno() {
		return pancard;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Immutable_Class s = new Immutable_Class("1223");
		System.out.println("Pan card number is::"+s.getpanno());

	}

}
