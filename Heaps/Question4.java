import java.util.PriorityQueue;
import java.util.TooManyListenersException;
import java.util.concurrent.PriorityBlockingQueue;

public class Question4 {

    static class Track implements Comparable<Track> {
        int val;
        int idx;

        public Track(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Track s1) {
            return this.val - s1.val;
        }

    }

    public static int TotalSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static int Minimum_Opeartions(int arr[]) {

        int originnalSum = TotalSum(arr);
        int targetSum = originnalSum/2;

        PriorityQueue<Track> pq = new PriorityQueue<>((a , b) -> b.val - a.val);

        for (int i = 0; i < arr.length; i++) {
            pq.add(new Track(arr[i], i));
        }

        int count = 0;


        while(originnalSum > targetSum) {

          Track currTrack = pq.peek();
          pq.remove();
          int maxval = currTrack.val;

          int halved = maxval/2;

          originnalSum -= halved;

          pq.add(new Track(halved, currTrack.idx));

          count ++;
        }

        return count;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        System.out.println(Minimum_Opeartions(arr));

    }
}
