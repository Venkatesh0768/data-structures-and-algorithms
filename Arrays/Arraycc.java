import java.util.Scanner;
import java.util.Scanner;

public class Arraycc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[3];
        for( int i =0; i<arr.length; i++){
            System.out.println("Enter the Elements " + i);
            arr[i] = sc.nextInt();
        }
       

        for(int i =0; i<=arr.length; i++){
            System.out.println(arr[i]);
        }
     }
}