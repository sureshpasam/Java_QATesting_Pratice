package JavaProgramsAll_latest_Java8Above;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		MethodOverloadinExample1 m = new MethodOverloadinExample1();
		//Method Overloading: changing no. of arguments
		System.out.println("adding two arg::: " + MethodOverloadinExample1.add(100, 200));
		System.out.println("adding three arg::: " + MethodOverloadinExample1.add(100, 200, 300));
		
		// Method Overloading: changing data type of arguments
		
		System.out.println("adding two arg changing data type::: " + MethodOverloadinExample1.add(100, 1.12));
		System.out.println("adding three arg changing data type::: " + MethodOverloadinExample1.add(100, 1.256, 512589));
		
		
		
//Why Method Overloading is not possible by changing the return type of method only?
//	In java, method overloading is not possible by changing the return type of the method only because of ambiguity. Let's see how ambiguity may occur:// Compile Time Error: method add(int,int) is already defined in class Adder

		
		/*Can we overload java main() method?
				//Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which 
		receives string array as arguments only. Let's see the simple example:*/

		System.out.println("main with String[]");
				
	}
	public static void main(String args){System.out.println("main with String");}  
	public static void main(){System.out.println("main without args");}  

}
