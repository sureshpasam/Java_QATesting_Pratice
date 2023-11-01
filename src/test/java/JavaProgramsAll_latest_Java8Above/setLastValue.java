package JavaProgramsAll_latest_Java8Above;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class setLastValue {
    setLastValue(){
        Set<String> set = new HashSet<>();
        set.add("Sure");
        set.add("sureee");
        set.add("ramesh");
        System.out.println("set vaues"+set);
        TreeSet<String> tree= new TreeSet<String>(set);
        set.addAll(tree);
        System.out.println("Tree set vaues"+tree);
        //System.out.println("last values set"+tree.last());
        Iterator<String> it = tree.iterator();
        while(it.hasNext()){
            it.next();
            System.out.println("last values set:::"+tree.last());
        }
    }
    public static void main(String args[]){
setLastValue se= new setLastValue();
    }
}
