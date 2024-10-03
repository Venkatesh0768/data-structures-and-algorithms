/**
 * Implemntation_Using_Array
 */
public class Implemntation_Using_Array {
    

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n ){
            arr = new int[n];
            size =n;
            rear =-1;
            front =-1;
        }

        public static boolean isEmpty(){
                return rear == -1 && front ==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if (rear  == size-1) {
                System.out.println("queue is full right now");
                return;
            }

            rear = (rear +1)%size;
            arr[rear] = data;
        }

        public static int Remove(){

            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;

            return front;

        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
         
        while (!q.isEmpty()) { 
            System.out.println(q.peek());
            q.Remove();
        }


    }
}