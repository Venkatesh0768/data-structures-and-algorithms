import java.util.LinkedList;
import java.util.PriorityQueue;

public class Question5 {
    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        LinkedList<Integer> ll3 = new LinkedList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        //list 1
        ll1.add(1);
        ll1.add(3);
        ll1.add(7);

        //list 2
        ll2.add(2);
        ll2.add(4);
        ll2.add(8);

        //list 3
        ll3.add(9);
        ll3.add(10);
        ll3.add(11);

        for(int i =0; i<ll2.size(); i++){
            pq.add(ll2.get(i));
            pq.add(ll1.get(i));
            pq.add(ll3.get(i));

        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        
        }
        
    }
}
