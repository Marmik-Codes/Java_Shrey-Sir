package Collections.ArrListTask.LinkkkedLiisst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Shuffle_Elem {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();

        li.add("Rose");
        li.add("Apple");
        li.add("Orange");
        li.add("Kiwi");

        System.out.println(li.get(1));
//
//        for (int i = 0; i < li.size(); i++) {
//            int temp[] = li.get(i);
//        }
//        System.out.println(li);
//
//        Collections.shuffle(li);
//        System.out.println(li);

        List<String> arrayLi = new ArrayList<String>(li);

        for (int i = arrayLi.size() - 1; i > 0 ; i--) {
            int j = (int) (Math.random() *(i+1));

            String temp = arrayLi.get(i);
            arrayLi.set(i , arrayLi.get(j));
            arrayLi.set(j,temp);
        }
//        return new LinkedList<>(arrayLi);
        System.out.println(arrayLi);

    }
}
