public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        int trans[][] = new int[arr[0].length][arr.length];
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                trans[i][j] =arr[j][i];
            }
        }
        for(int i=0; i<trans.length; i++){
            for(int j=0; j<trans[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
   
}
