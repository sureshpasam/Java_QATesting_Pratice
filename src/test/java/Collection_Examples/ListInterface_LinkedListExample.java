package collection_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListInterface_LinkedListExample {
	
	public void linkedList2() {
		 LinkedList<String> ll=new LinkedList<String>();  
         ll.add("Ravi");  
         ll.add("Vijay");  
         ll.add("Ajay");  
         ll.add("Vijay");  
         ll.add("Ajay");  
         ll.add("Vijay");  
         ll.add("Ajay");  
         //Traversing the list of elements in reverse order  
         Iterator i=ll.iterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         } 
          
	}
	
	public void ConvertArrayToLIst() {
		String[] array={"Java","Python","PHP","C++"};  
      
        List<String> al = Arrays.asList(array);
        System.out.println("Arrays to List:::"+al);  
	}
	
	public void ConvertListToArray() {
		List<String> li=new LinkedList<String>();  
		li.add("Ravi");  
		li.add("Vijay");  
		li.add("Ajay");  
		li.add("Vijay");  
		li.add("Ajay");  
		String[] listToArray= li.toArray(new String[li.size()]);
        System.out.println("List to Arrays:::"+Arrays.toString(listToArray));  
	}

	public void EachCharCountWithOutUsingLoop() {
		String string = "aasjjikkk";

		Map<Character, Long> characterFrequency = string.chars()  // creates an IntStream
		    .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
		    .collect(Collectors.groupingBy(c -> c, Collectors.counting())); 
		
		System.out.println("Each Char Count WithOut Using Loop"+characterFrequency);
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListInterface_LinkedListExample li = new ListInterface_LinkedListExample();
li.linkedList2();
li.ConvertArrayToLIst();
li.ConvertListToArray();
li.EachCharCountWithOutUsingLoop();
	}

}
