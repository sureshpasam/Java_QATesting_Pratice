package JavaProgramsAll_latest_Java8Above;

public final class immutableString {
	/* The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
	The class is final so we cannot create the subclass.
	There is no setter methods i.e. we have no option to change the value of the instance variable.  
	*/
	
	final String pancardNumber;  
	  
	public immutableString(String pancardNumber){  
	this.pancardNumber=pancardNumber;  
	}  
	  
	public String getPancardNumber(){  
	return pancardNumber;  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		immutableString im = new immutableString("CUTPP5623B");
System.out.println("Pan number is::"+im.getPancardNumber());
	}

}
