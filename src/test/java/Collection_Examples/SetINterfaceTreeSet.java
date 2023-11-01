package Collection_Examples;

import java.util.Iterator;
import java.util.TreeSet;

public class SetINterfaceTreeSet {
public void treeSetExample1() {
	 //Creating and adding elements  
	  TreeSet<String> al=new TreeSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  //Traversing elements  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	  
	  
}
public void treesetEx2() {
	 TreeSet<String> set=new TreeSet<String>();  
     set.add("Ravi");  
     set.add("Vijay");  
     set.add("Ajay");  
     System.out.println("Traversing element through Iterator in descending order");  
     Iterator i=set.descendingIterator();  
     while(i.hasNext())  
     {  
         System.out.println(i.next());  
     }  
       
}
public void treeSetEx3() {
	TreeSet<Integer> set=new TreeSet<Integer>();  
    set.add(24);  
    set.add(66);  
    set.add(12);  
    set.add(15);  
    System.out.println("Highest Value: "+set.pollFirst());  
    System.out.println("Lowest Value: "+set.pollLast());  
} 

public void treeSetEx4() {
	 TreeSet<String> set=new TreeSet<String>();  
     set.add("A");  
     set.add("B");  
     set.add("C");  
     set.add("D");  
     set.add("E");  
     System.out.println("Initial Set: "+set);  
       
     System.out.println("Reverse Set: "+set.descendingSet());  
       
     System.out.println("Head Set: "+set.headSet("C", true));  
      
     System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
       
     System.out.println("TailSet: "+set.tailSet("C", false));  
}
public void treeSetEx5() {
	TreeSet<String> set=new TreeSet<String>();  
    set.add("A");  
    set.add("B");  
    set.add("C");  
    set.add("D");  
    set.add("E");  
      
    System.out.println("Intial Set: "+set);  
      
    System.out.println("Head Set: "+set.headSet("C"));  
     
    System.out.println("SubSet: "+set.subSet("A", "E"));  
      
    System.out.println("TailSet: "+set.tailSet("C"));  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetINterfaceTreeSet set = new SetINterfaceTreeSet();
		set.treeSetExample1();
		set.treesetEx2();
		set.treeSetEx3();
		set.treeSetEx4();
		set.treeSetEx5();
		

	}

}
