package Collection_FrameWork.List.Set;

import java.util.TreeSet;

public class set_02_prog {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);

        System.out.println(numbers); // Output: [1, 3, 5, 9]
    }
}
