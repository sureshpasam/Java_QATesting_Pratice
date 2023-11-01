package Collection_Examples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfaceLinkedHashSet {
	
	public void LinkedHashSetExample() {
		//Creating HashSet and adding elements  
        LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("One");    
               set.add("Two");    
               set.add("Three");   
               set.add("Four");  
               set.add("Five");  
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetInterfaceLinkedHashSet set =new SetInterfaceLinkedHashSet();
		set.LinkedHashSetExample();

	}

}
