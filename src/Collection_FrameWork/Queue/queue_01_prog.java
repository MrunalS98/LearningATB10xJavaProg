package Collection_FrameWork.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue_01_prog {
    public static void main(String[] args) {

        Queue name = new PriorityQueue();

        name.add("Ram");
        name.add("Moni");
        name.add("Ali");
        name.add("Catt");
        name.offer("Hello");
        System.out.println(name);
        System.out.println(name.peek());
        System.out.println(name);
        System.out.println(name.poll());
        System.out.println(name);
    }
}
