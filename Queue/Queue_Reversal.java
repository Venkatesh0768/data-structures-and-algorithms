import java.util.LinkedList;
import java.util.*;;

public class Queue_Reversal {


    public static void queue_reversal(Queue<Integer> q){

        Stack<Integer> s = new Stack<>();

       
        System.out.println();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }



    

    }
    public static void main(String[] args) {
        Queue<Integer> s = new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        queue_reversal(s);
    }
}
