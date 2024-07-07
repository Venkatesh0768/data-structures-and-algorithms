import java.util.Scanner;
public class Searching {
    public static boolean Search( int arr[][] , int key){
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.print("(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[][] = new int[3][3];
            for(int i =0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print("enter the elemet ");
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i =0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print( arr[i][j] + " ");
                }
                System.out.println();
            }

            Search(arr, 6);
        }
    }
    
}

