package Collection_FrameWork.List;

import java.util.ArrayList;
import java.util.List;

public class Nested_List {
    public static void main(String[] args) {

        List<String> fruits1 = new ArrayList<>();
        fruits1.add("Apple");
        fruits1.add("Orange");
        fruits1.add("Mango");

        List<Integer> Numbers = new ArrayList<>();
        Numbers.add(12);
        Numbers.add(122);
        Numbers.add(1222);

        List<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');

        List all_list = new ArrayList();
        all_list.add(fruits1);
        all_list.add(Numbers);
        all_list.add(list1);

        System.out.println(all_list);

    }
}
