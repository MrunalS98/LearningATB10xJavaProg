package Collection_FrameWork.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Prog_01 {
    public static void main(String[] args) {

        ArrayList arrayOne = new ArrayList<>();

        arrayOne.add("Orange");
        arrayOne.addAll(Arrays.asList("Orange", "Apple", "Watermelon"));
        arrayOne.add("Banana");
        arrayOne.add("Mango");
        arrayOne.add("23.9");
        arrayOne.add("1234");
        System.out.println(arrayOne);
        System.out.println(arrayOne.size());

        List l =new ArrayList();    //can create child object with parent class
        l.add("0986");              //ArrayList is a chile of List
        l.add("null");
        System.out.println(l);
    }
}
