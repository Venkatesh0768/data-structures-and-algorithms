public class spiralMatrix {
    public static void main(String[] args) {
         int matrix[][] = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};

        SpiralMatrix(matrix);
           
    }
    public static void SpiralMatrix(int matrix[][]){
        int startrow =0;
        int endrow= matrix.length-1;
        int startcols = 0;
        int endcols = matrix[0].length-1;

        while (startcols<=endcols && startrow<=endcols) {
            //top
            for(int j=startcols; j<=endcols; j++){
                System.out.print(matrix[startrow][j] + " ");
            }

            //Right
            for(int i = startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcols] +" ");
            }

            // left
            for(int j=endcols-1; j>=startcols; j--){
                System.out.print(matrix[endrow][j] +" ");
            }

             //up
             for(int j=endrow-1; j>=startrow+1; j--){
                System.out.print(matrix[j][startcols] +" ");
            }

            startrow++;
            endrow--;
            startcols++;
            endcols--;




        }
    }
}
