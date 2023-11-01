package JavaProgramsAll_latest_Java8Above;

public class MethodOverloadinExample1 {
	//Method Overloading: changing no. of arguments
	static int add(int a,int b) {
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
		
	}
// Method Overloading: changing data type of arguments

	
	static double add(int a,double b,float c) {
		return a+b+c;
}

	public static double add(int i, Double d) {
		// TODO Auto-generated method stub
		return i+d;
	}
	
	
}
