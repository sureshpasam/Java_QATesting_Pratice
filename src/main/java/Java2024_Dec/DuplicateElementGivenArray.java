package Java2024_Dec;


import java.util.HashSet;
import java.util.Set;

public class DuplicateElementGivenArray {
    public static void main(String[] args){
        int [] input = {1,2,3,5,4,0,1,2,3,5,6,7};
        Set<Integer> set = new HashSet<>();
        for (int value:input){
            if (!set.add(value)){
                System.out.println("Duplicate Value:: "+value);
            }
        }
    }
}
