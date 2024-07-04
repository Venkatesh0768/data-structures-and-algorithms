public class MaxsubArray {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        pairarray(arr);
        kadenesalog(arr);
    }
    public static void kadenesalog(int number[]){
        int ms = Integer.MIN_VALUE;
        int  cs = 0;

        for(int i =0; i<number.length; i++){
            cs =cs + number[i];
            if(cs < 0){
                cs =0;
            }
            ms = Math.max(cs ,ms);
    
        }
        System.out.println("max subbarray is : "+ ms);
    }

    public static void pairarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int largest_value = Integer.MIN_VALUE;
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = (sum + arr[k]);
                    System.out.print(arr[k] + " ");
                }

                System.out.print("=" + sum);
                System.out.println();
                if (largest_value < sum) {
                    largest_value = sum;

                }
            }
            System.out.println("largest Value is " + largest_value);

            System.out.println();
        }
    }

}
