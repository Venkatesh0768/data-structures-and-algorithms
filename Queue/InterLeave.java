import java.util.LinkedList;
import java.util.Queue;

/**
 * InterLeave
 */
public class InterLeave {

    public static void interleave(Queue<Integer> q){
        Queue<Integer> firtHalf = new LinkedList<>();
        int size = q.size();

        for(int i =0; i<size/2; i++){
            firtHalf.add(q.remove());
        }

        while (!firtHalf.isEmpty()) {
            q.add(firtHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> s =  new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);
        s.add(10);

        interleave(s);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.remove();
        }
        System.out.println();
        
    }
}