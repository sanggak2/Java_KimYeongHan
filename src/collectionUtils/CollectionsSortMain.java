package collectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(1);
        System.out.println(list);

        /*Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("max = "+max);
        System.out.println("min = "+min);

        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("shuffled_list = "+list);
        Collections.sort(list);
        //->list.sort(null);
        System.out.println("sorted list = "+list);
        Collections.reverse(list);
        System.out.println("reversed list = "+list);*/

        TreeSet<Integer> treeSet = new TreeSet<>(list.subList(0, 5));
        System.out.println(treeSet+", 합계: ");
    }
}
