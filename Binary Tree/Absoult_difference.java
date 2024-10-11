public class Absoult_difference {
    public static void main(String[] args) {
        int arr[] ={3,5,6,8,11,20};
        int key = 19;

        int Difference = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            int abs =  Math.abs(key - arr[i]);
            // System.out.print(abs + " ");
            if (Difference > abs) {
                Difference = abs;
            }
        }
        System.out.println(Difference);
    }
    
}