import java.util.PriorityQueue;

public class Compator {
    static class  Students implements Comparable<Students> {
        int rank;
        String name;

        public Students(int rank , String name){
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Students s2){
            return this.rank - s2.rank;
        }
        
    }
   public static void main(String[] args) {
    

    PriorityQueue<Students> pq = new PriorityQueue<>();
    pq.add(new Students(3, "Venky"));
    pq.add(new Students(4, "venk"));
    pq.add(new Students(6, "rohit"));
    pq.add(new Students(32, "Venky"));
    pq.add(new Students(1, "Venky"));

    while (!pq.isEmpty()) {
        System.out.println(pq.peek().rank);
        pq.remove();
    }
   }
}
