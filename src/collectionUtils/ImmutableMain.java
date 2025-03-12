package collectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변리스트를 가변으로 : 그냥 가변리스트에 넣으면 됨
        List<Integer> list = List.of(1, 2, 3);  //불변리스트
        List<Integer> mutable = new ArrayList<>(list);  //가변리스트
        mutable.add(4);
        System.out.println("mutable = " + mutable);

        //가변을 불변으로 : Collections.unmodifiableList()
            //unmodifiableXxx...가 있음 (map, set 등등)
        List<Integer> unmodifiableList =
                Collections.unmodifiableList(mutable);
        System.out.println("list class = " + list.getClass());
        System.out.println("unmodifiableList class = " + unmodifiableList.getClass());


    }
}
