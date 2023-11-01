package JavaProgramsAll_latest_Java8Above;

public class thisKeywordStep1 {

	int rollno;
	String name;
	float fee;
	int acco;

	thisKeywordExamples exam;

	public thisKeywordStep1() {

		System.out.println("Executed current class Constructor ::::");
	}

	// 1) this: to refer current class instance variable
	public thisKeywordStep1(int rollno, String name, float fee) {
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		System.out.println("Executed refer to the instance variable ::::");

	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
	/// 2 this: to invoke current class method

	void currentClassMethod() {
		System.out.println("Executed current class method::::");
		this.display();
	}

	void display1() {
		System.out.println(rollno + " " + name + " " + fee + " " + acco);
	}

	// 3) this() : to invoke current class constructor real use of
	public thisKeywordStep1(int rollno, String name, float fee, int acco) {
		// TODO Auto-generated constructor stub
		this(rollno, name, fee);
		// with out parameter constructor calledn
		this.acco = acco;

	}

	// 3) this() : to invoke current class constructor another way
	public thisKeywordStep1(int rollno, String name) {
		this();
		this.rollno = rollno;
		this.name = name;

	}

	// this: to pass as an argument in the method

	public void passAsAnArgMethod(thisKeywordStep1 thisKeywordStep1) {

		System.out.println("to pass as an argument in the method UserName is:::");

	}

	public void passAsAnArgMethodd() {

		System.out.println("UserName is:::");
		passAsAnArgMethod(this);

	}
	// this: to pass as argument in the constructor call

	thisKeywordStep1(thisKeywordExamples exam) {
		this.exam = exam;

	}

	void displayConstructorcall() {
		System.out.println("this: to pass as argument in the constructor call::: " + exam.data);// using data member of
																								// A4 class
	}

	// 6:: this keyword can be used to return current class instance

	thisKeywordStep1 getthisKeywordStep1() {
		return this;

	}

	void msg() {
		System.out.println("this keyword can be used to return current class instance");
	}
}
