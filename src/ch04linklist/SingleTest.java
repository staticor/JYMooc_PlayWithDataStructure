package ch04linklist;

public class SingleTest {

    public static void main(String[] args) {
        SingleLinkedList<String> sl = new SingleLinkedList<>();

        sl.addFirst("hello");
        sl.addFirst(",");
        sl.addFirst("world!");
        sl.addFirst("!");

        System.out.println(sl);

        sl.add(2, "666");

        System.out.println(sl);

        sl.remove(2);

        System.out.println(sl);

        sl.removeFirst();
        System.out.println(sl);
        sl.removeLast();
        System.out.println(sl);
    }
}
