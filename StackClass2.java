
/*stack using java  collection frameworks , which will help you to solve code in very less 
time for competitive codings*/
import java.util.*;

public class StackClass2 {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
