package JavaPratice8.JavaPratice8;

import java.util.ArrayList;
import java.util.List;

public class LamdaListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai"); 
      
        list.forEach((n)->System.out.println("list of the values is::"+n)) ;
	}

}
