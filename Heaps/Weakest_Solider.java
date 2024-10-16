import java.util.PriorityQueue;

public class Weakest_Solider {

    static class InnerWeakest_Solider implements Comparable<InnerWeakest_Solider> {
        int soilder;
        int idx;

        public InnerWeakest_Solider (int soilder , int idx){
            this.soilder = soilder;
            this.idx = idx;
        }


        @Override
        public int compareTo(InnerWeakest_Solider s1){
            if (this.soilder == s1.soilder) {
                return this.idx - s1.idx;
            }
            else{
                return this.soilder - s1.soilder;
            }
        }
        
    }

    public static void main(String[] args) {
        int army[][] = { 
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1}, 
                { 1, 0, 0, 0 }, 
                { 1, 0, 0, 0 } };

        int k =2;

        PriorityQueue<InnerWeakest_Solider> pq = new PriorityQueue<>();

        for(int  i =0; i<army.length; i++){
            int count =0;
            for(int j =0; j<army[0].length; j++){
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new InnerWeakest_Solider(count, i));
        }

        for(int i=0; i<k; i++){
           System.out.println("R" + pq.peek().idx);
           pq.remove();
        }
         
    }

}
