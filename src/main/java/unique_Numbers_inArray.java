

import java.util.*;
import java.util.stream.Collectors;

public class unique_Numbers_inArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer[] input = {1, 2, 4, 2, 3, 6, 3, 1, 7, 9, 0, 9};

        String s = "sureshpasam";
        char[] ss = s.toCharArray();
        //Arrays.stream(input).forEach(p->System.out.println(p));

        //Arrays.stream(input).filter(i->unique_Numbers_inArray.class).boxed().collect(Collectors.toSet());
        Set<Integer> uniqueElements = new HashSet<>();
      //  Arrays.stream(input).filter(i -> !uniqueElements.add(i)).boxed().collect(Collectors.toList());
       // System.out.println(Arrays.stream(input).filter(i -> !uniqueElements.add(i)).boxed().collect(Collectors.toSet()));
        //set.addAll(Arrays.asList(input));


// ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(input));

        System.out.println(numbersList);
        Set<Integer> set = new HashSet<>(numbersList);
		System.out.println("Printing the set values:::" + set);

		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);

        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);

        System.out.println(listWithoutDuplicates);

        System.out.println("LInked unique elemeent" + hashSet);


//ArrayList with duplicate elements
        ArrayList<Integer> numbersLis = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        System.out.println(numbersLis);

        List<Integer> listWithoutDuplicate = numbersLis.stream().distinct().collect(Collectors.toList());
        System.out.println(listWithoutDuplicate);
    }

}
