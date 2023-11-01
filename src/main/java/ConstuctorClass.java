

public class ConstuctorClass {
	
	ConstuctorClass(String name){
		System.out.println("name is ::"+name);
	}
	ConstuctorClass(){
		System.out.println("suresh");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstuctorClass c = new ConstuctorClass("suresh");
		ConstuctorClass c1 = new ConstuctorClass();

	}

}
