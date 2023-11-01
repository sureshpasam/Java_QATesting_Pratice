package Collection_Examples;

public class CollectionFrameWorkBasicOverView {

	public static void main(String[] args) {
		String s ="suresh pasam";
		String.format("%q", s);

	
		
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 *  a framework that provides an architecture to store and manipulate the group of objects.
		 * Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

		Java Collection means a single unit of objects. 
		Java Collection framework provides many interfaces (Set, List, Queue, Deque)
         classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
         
=============================================================================       
What is Collection in Java?
A Collection represents a single unit of objects, i.e., a group.

What is a framework in Java
It provides readymade architecture.
It represents a set of classes and interfaces.
It is optional.
====================================================

Iterator interface
Iterator interface provides the facility of iterating the elements in a forward direction only.
Methods of Iterator interface
There are only three methods in the Iterator interface. They are:

Method	
1	public boolean hasNext()	It returns true if the iterator has more elements otherwise it returns false.
2	public Object next()	It returns the element and moves the cursor pointer to the next element.
3	public void remove()	It removes the last elements returned by the iterator. It is less used.

=======================================================================
Iterable Interface
The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.

It contains only one abstract method. i.e.,

Iterator<T> iterator()  
It returns the iterator over the elements of type T.
===================================================================



		
		*/
		
	}

}
