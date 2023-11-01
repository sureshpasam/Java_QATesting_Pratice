

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class unique_Numbers_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1,2,4,2,3,6,3,1,7,9,0,9};
		
		String s = "sureshpasam";
		char[] ss = s.toCharArray();
		//Arrays.stream(input).forEach(p->System.out.println(p));
	
		//Arrays.stream(input).filter(i->unique_Numbers_inArray.class).boxed().collect(Collectors.toSet());
Set<Integer> uniqueElements = new HashSet<>();
Arrays.stream(input).filter(i -> !uniqueElements.add(i)).boxed().collect(Collectors.toList());
System.out.println(Arrays.stream(input).filter(i -> !uniqueElements.add(i)).boxed().collect(Collectors.toSet()));
		//set.addAll(Arrays.asList(input));
	

// ArrayList with duplicate elements
ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
 
System.out.println(numbersList);

LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);
 
ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
 
System.out.println(listWithoutDuplicates);

//ArrayList with duplicate elements
ArrayList<Integer> numbersLis = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
 
System.out.println(numbersLis);

List<Integer> listWithoutDuplicate = numbersLis.stream().distinct().collect(Collectors.toList());
System.out.println(listWithoutDuplicate);
	}

}
