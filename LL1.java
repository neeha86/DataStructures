import java.util.*;

//collection frameworks
public class LL1 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addLast("list");
        System.out.println(list);

        list.addFirst("a");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ->");
        }
        System.out.println("null");
        list.remove(1);
        System.out.println(list);
    }
}
