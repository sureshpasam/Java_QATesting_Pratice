

import java.util.ArrayList;
import java.util.List;

public class typeInterfaceCollections {

	public static void showList(List<Integer> list) {
		if(!list.isEmpty()) {
			list.forEach(System.out::println);

		}else {
			System.out.println("list is empty");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(13);
		list1.add(14);
		showList(list1);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(500);
		showList(list2);
		
		showList(new ArrayList<>());
	}

}
