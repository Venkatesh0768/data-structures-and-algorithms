import java.util.*;

public class hashmap_implementation {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        @SuppressWarnings("unchecked")
        private void reHash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (Node node : ll) {
                    put(node.key, node.value);
                }
                
            }

        }

        

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearechInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                reHash();
            }

        }

        private int SearechInLL(K key, int bi) {
            int di = 0;
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        public boolean isConatainsKey(K key) {

            int bi = hashFunction(key);
            int di = SearechInLL(key, bi);
            if (di != -1) {
                return true;
            } else {
                return false;
            }

        }
        public V get(K key) {

            int bi = hashFunction(key);
            int di = SearechInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }

        }

        public V remove(K key) {

            int bi = hashFunction(key);
            int di = SearechInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
               return null;
            }
 
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i =0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;

        }


        public boolean isEmpty(){
            return n ==0;
        }



    }

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 10);
        hm.put("Kolkata ", 10);
        hm.put("China", 10);

        ArrayList<String> keys= hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }
}
