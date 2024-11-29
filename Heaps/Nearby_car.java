import java.util.PriorityQueue;

public class Nearby_car {

    static class InnerNearby_car implements Comparable<InnerNearby_car> {
      int x;
      int y;
      int diff;
      String ch ;

      public InnerNearby_car(int x , int y ,String ch)   {
        this.diff = (x*x )+ (y*y);
        this.ch = ch;
      }

      @Override
      public int compareTo(InnerNearby_car d2){
        return this.diff - d2.diff;
      }
    }
    
    public static void main(String[] args) {

        PriorityQueue<InnerNearby_car> pq = new PriorityQueue<>();

        pq.add(new InnerNearby_car(3, 3, "C0"));
        pq.add(new InnerNearby_car(5, -1, "C1"));
        pq.add(new InnerNearby_car(-2, 4, "C2"));

        int k =2;

        for(int i =0; i<k; i++){
            System.out.println(pq.peek().ch);
            pq.remove();
        }
       


        
    }
}
