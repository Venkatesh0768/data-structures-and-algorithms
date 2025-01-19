import java.nio.file.Path;

public class Vaildpath {

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1 , 1}, {2, 2, 2, 2}, {1, 1, 1,1},{2, 2, 2, 2}};
        int[][] arr2 = {{1,1,3}, {3,2,2}, {1,1,4}};
        int[][] arr3 = {{1,2},{4,3}};

        System.out.println(Valid_Path(arr3));
    }

    static int Valid_Path(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int cost = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    if (j == m -1 ) {
                        cost++;
                        i++;
                    } else {
                        j++;
                    }
                }else if (arr[i][j] == 2){
                    if (j == m -1  ){
                        cost++;
                        i++;
                    }
                    else {
                        j--;
                    }
                } else if (arr[i][j] == 3) {
                    i++;
                }
            }
        }

        return cost;
    }
}
