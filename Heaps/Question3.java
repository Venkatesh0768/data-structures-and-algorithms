import java.util.PriorityQueue;

public class Question3 {

    static class Slot implements Comparable<Slot> {
        int slot;
        int time;
        public Slot(int slot , int time){
            this.slot = slot;
            this.time = time;
        }


        @Override
        public int compareTo(Slot s1){
            return this.time - s1.time;
        }
        
    }

    public static int MaxTime(int N , int K , int arr[]){
        boolean visited[] = new boolean[N+1];
        PriorityQueue<Slot> pq = new PriorityQueue<>();

        int maxtime =0;
        //add the all filled Slot 
        for(int i : arr){
            pq.add(new Slot( i , 0));
            visited[i] = true;
        }

        //adjacent of the right and left 

        while (!pq.isEmpty()) {
            Slot current = pq.poll();
            int currentSlot = current.slot;
            int currentTime = current.time;

            maxtime = Math.max(maxtime, currentTime);

            //currentslot +1 and currentslot -1
            if (currentSlot -1  >=1 && !visited[currentSlot -1]) {
                visited[currentSlot -1 ] =true;
                pq.offer(new Slot(currentSlot -1, currentTime +1));
            }

            if (currentSlot +1  <= N && !visited[currentSlot +1]) {
                visited[currentSlot + 1 ] =true;
                pq.offer(new Slot(currentSlot + 1, currentTime +1));
            }

        }

        return maxtime;
    }
    public static void main(String[] args) {

        int N1 = 6, K1 = 2;
        int[] arr1 = {2,6};
        System.out.println(MaxTime(N1, K1, arr1));
    }
}
