import java.util.*;;
public class Rope {

    public static void main(String[] args) {
        int arr[] = {2,3,3,4,6};

        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        for(int i =0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int cost =0;
        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();

            cost += min+min2;
            pq.add(min + min2);
        }

        System.out.println(cost);

    }
    
}
