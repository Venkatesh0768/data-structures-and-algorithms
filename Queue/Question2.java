import java.util.*;

public class Question2 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(6);


        int total =0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int cost = first + second;
            total += cost;
            pq.add(cost);
        }


        System.out.println(total);

       
    }

}
