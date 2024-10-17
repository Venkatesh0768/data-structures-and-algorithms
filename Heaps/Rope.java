import java.util.*;;

public class Rope {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 4, 6 };

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int max = 0;

        while (pq.size() > 1) {
            int c1 = pq.remove();
            int c2 = pq.remove();

            max += c1 + c2;
            pq.add(c1 + c2);
        }

        System.out.println(max);

    }

}
