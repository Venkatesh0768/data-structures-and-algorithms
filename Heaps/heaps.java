import java.util.ArrayList;

/**
 * heaps
 */
public class heaps {

    static class Heaps {
        ArrayList<Integer> arr = new ArrayList<>();

        public void insert(int data) {
            arr.add(data);

            int x = arr.size() - 1;//child
            int par = (x - 1) / 2;// parent 

            while (arr.get(x) < arr.get(par)) { //O(logn)

                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }

        }

        public int peek() {
            return arr.get(0);

        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // step 1 to swap the first and last node
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // remove the last node
            arr.remove(arr.size() - 1);

            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return arr.size() ==0;
        }

    }

    public static void main(String[] args) {
        Heaps s = new Heaps();
        s.insert(3);
        s.insert(4);
        s.insert(1);
        s.insert(5);
        

        while (!s.isEmpty() ) {
            System.out.println(s.peek());
            s.remove();
        }

       

    }
}