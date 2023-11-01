package JavaPratice8.JavaPratice8;

public class Method_Overriding {
		  void run(){System.out.println("Vehicle is running");}  
		}  
		//Creating a child class  
		class Bike extends Method_Overriding { 
			
			void run(){System.out.println("child Vehicle is running");
			}  
		  public static void main(String args[]){  
		  //creating an instance of child class  
			  Bike obj = new Bike();  
		  //calling the method with child class instance  
		  obj.run();  
		  obj.run();  
		  }  
		}  

