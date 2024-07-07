import javax.swing.text.html.parser.Element;

public class SearchingMatrix {
    public static void main(String[] args) {
        int matix[][] ={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        int key = 33;
        MatrixSearching(matix, key);
     }

    //  public static boolean MatrixSearching(int matrix[][] , int key){
    //     int row =0;
    //     int cols = matrix[0].length -1;
    //     while (row < matrix.length && cols>=0) {
    //         if (matrix[row][cols] == key) {
    //             System.out.println("Element Found on " + "(" + row + "," + cols + ")");
    //             return true;
    //         }
    //         else if (key < matrix[row][cols]) {
    //             cols--;
    //         }
    //         else{
    //             row++;
    //         }
    //     }
    //     return false;
    //  }

    //  Method 2

    public static boolean MatrixSearching(int matrix[][] , int key){
        int row =matrix.length-1;
        int cols = 0;
        while (cols < matrix.length && row>=0) {
            if (matrix[row][cols] == key) {
                System.out.println("Element Found on " + "(" + row + "," + cols + ")");
                return true;
            }
            else if (key < matrix[row][cols]) {
                row--;
            }
            else{
                cols++;
            }
        }
        return false;
     }
}
