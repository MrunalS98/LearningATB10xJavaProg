package Collection_FrameWork.List.Set;

import java.util.HashSet;
import java.util.Set;

public class set_01_prog {
    public static void main(String[] args) {

        Set myset1 = new HashSet();

        myset1.add("Apple");
        myset1.add("Mango");
        myset1.add(123);
        myset1.add("Mango");
        myset1.add(null);
        System.out.println(myset1);
    }
}
