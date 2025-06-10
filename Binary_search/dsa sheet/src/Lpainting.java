public class Lpainting {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        int[][] mat = {{1,4} ,{2,3}};

//        int[] arr = {2,8,7,4,1,3,5,6,9};
//        int[][] mat = {{3,2,5},{1,4,6},{8,7,9}};
        System.out.println(firstCompleteIndex(arr, mat));
    }

    static int firstCompleteIndex(int[] arr, int[][] mat) {

        for (int i = 0; i < arr.length; i++) {
            int n = mat.length;
            int m = mat[0].length;

            int low = 0;
            int high = (n*m-1);

            while(low<=high){
                int mid = (low +high)/2;
                int row = mid/m;
                int col = mid%m;
                if(mat[row][col] == arr[i]){
                    mat[row][col] = -1;
                    if (checkPaints(mat , row , col)){
                        return  i;
                    }
                }else if(mat[row][col] < arr[i]){
                    low = mid +1;
                }else{
                    high = mid -1;
                }

            }

        }
        
        return -1;
    }

    static boolean checkPaints(int[][] arr , int i , int j){
        int rows  = arr.length;
        int cols = arr[0].length;
        for (int k = 0; k <=j; k++)
        {
            if (arr[i][k] != -1){
                return false;
            }
        }

        //maxRIght
        for (int k = j; k <cols; k++)
        {
            if (arr[i][k] != -1){
                return false;
            }
        }

        //maxUP
        for (int k = 0; k <= i; k++)
        {
            if (arr[k][j] != -1){
                return false;
            }

        }

        for (int k = i; k < rows; k++)
        {
            if (arr[k][j] != -1){
                return false;
            }
        }
        return  true;
    }
}
