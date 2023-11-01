package JavaProgramsAll_latest_Java8Above;

public class thisKeywordExamples {
	int data=50;
	// this: to pass as argument in the constructor call
	thisKeywordExamples(){
		thisKeywordStep1 step = new thisKeywordStep1(this);
		step.displayConstructorcall();
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		thisKeywordStep1 thisKeyWordOne= new thisKeywordStep1(38992,"Suresh Pasam", 53);
		thisKeyWordOne.display();
		thisKeyWordOne.currentClassMethod();
		thisKeywordStep1 thisKeyWordThree= new thisKeywordStep1(38992,"Suresh Pasam");
		thisKeyWordThree.display();
		thisKeywordStep1 thisKeyWordFour= new thisKeywordStep1(38992,"Suresh Pasam",801900,533);
		thisKeyWordFour.display1();	
		thisKeywordStep1 thisKeyWordfive= new thisKeywordStep1();
		thisKeyWordfive.passAsAnArgMethodd();
		// this: to pass as argument in the constructor call
		thisKeywordExamples s = new thisKeywordExamples();
		//  this keyword can be used to return current class instance
		new thisKeywordStep1().getthisKeywordStep1().msg();

		
	
	}
	
	
}
