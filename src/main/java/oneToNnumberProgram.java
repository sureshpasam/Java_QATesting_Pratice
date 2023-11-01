

import java.io.Console;

public class oneToNnumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num =50;
		for(int i =1;i<=num;i++) {
			if(i%5==0 && i%7==0 ) {
				System.out.println("Divisable by 5 and 7:: CATech");

			} else if(i%5==0) {
				System.out.println("Divisable by 5:: CA");
			}
			else if(i%7==0) {
				System.out.println("Divisable by 7:: TECH");
			}
			else {
				System.out.println("NUmber:: "+i);
			}

		}
	}*/
		 int n =50;
	      
		 oneToNnumberProgram .natural(n,1);
	 
	 
	    }
	    static int natural(int y, int i)
	    {
	        if(i <= y)
	        {
	            System.out.print(i+" ");
	            return(natural(y,++i));
	        }
	        return 1;
	    }

}
