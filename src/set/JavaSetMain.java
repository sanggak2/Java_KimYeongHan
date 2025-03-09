package set;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }
    private static void run(Set<String> set){
        System.out.println("set = " + set.getClass());
        set.add("Ca");
        set.add("AbC");
        set.add("Bab");
        set.add("1");
        set.add("3");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

    }
}
