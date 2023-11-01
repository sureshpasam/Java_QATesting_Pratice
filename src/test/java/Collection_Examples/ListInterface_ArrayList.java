package Collection_Examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListInterface_ArrayList {
	ArrayList<String> Arlist = new ArrayList<String>();

	public void arliadd() {
		Arlist.add("Suresh");
		Arlist.add("Lakshmi");
		Arlist.add("chaitu");
		Arlist.add("chenchu lakshmi chaitu");
		System.out.println("List values::" + Arlist);

	}

	public void arliWithDifferItera() {
		// option 1
		Iterator<String> it = Arlist.iterator();
		while (it.hasNext()) {
			System.out.println("List of values with iterate::" + it.next());
		}

	}

	public void arliWithDifferIteraOPtion2() {
		for (String li : Arlist) {
			System.out.println("List of values with iterate for Each::" + li);
		}
	}

	public void arliWithDifferIteraOPtion3() {
		for (int i = 0; i < Arlist.size(); i++) {
			System.out.println("List of values with iterate for::" + Arlist.get(i));
		}
	}

	public void arliWithDifferIteraOPtion4WithListIterator() {
		ListIterator<String> listIteartor = Arlist.listIterator(Arlist.size());
		while (listIteartor.hasNext()) {
			System.out.println("Traversing forward direction::" + listIteartor.next());

		}

		while (listIteartor.hasPrevious()) {
			System.out.println("Traversing reverse  direction::" + listIteartor.previous());

		}
	}

	public void arliWithForEachAndForEachRemainiing() {
		Arlist.forEach(a -> {
			{
				System.out.println("usering lamda experssion for for each:::" + a);
			}
		});

		Iterator<String> it = Arlist.iterator();
		it.forEachRemaining(action -> {
			System.out.println("usering lamda experssion for for eachremaing:::" + action);
		});
	}

	public void sortForLIst() {
		ArrayList<String> liii = new ArrayList<String>();
		liii.add("A");
		liii.add("A");
		liii.add("B");
		liii.add("Z");
		liii.add("F");
		liii.add("D");
		Collections.sort(liii);
		for (String al : liii) {
			System.out.println("****************************");
			System.out.println("Sorting of the Array LIst...:::" + al);
		}

		Collections.sort(liii,Collections.reverseOrder());
		for (String al : liii) {
			System.out.println("****************************");
			System.out.println("Reverse order  of the Array LIst...:::" + al);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListInterface_ArrayList al = new ListInterface_ArrayList();
		al.arliadd();
		al.arliWithDifferItera();
		al.arliWithDifferIteraOPtion2();
		al.arliWithDifferIteraOPtion3();
		al.arliWithDifferIteraOPtion4WithListIterator();
		al.arliWithForEachAndForEachRemainiing();
		al.sortForLIst();
		
				

	}

}
