public class Question1 {
    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int key = 7;
        int count = 0;

        // method 1 O(n^2)
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (arr[i][j] == key) {
        //             count += 1;
        //         }
        //     }
        // }

        int row =0;
        int col = arr.length-1;
        while (row < arr.length && col >=0) {
            if(arr[row][col] == key){
                count++;
            }else if (key<arr[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println(count);
    }
}
