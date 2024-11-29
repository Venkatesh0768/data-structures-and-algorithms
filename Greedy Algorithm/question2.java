import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class question2 {

    public static void Printarray(ArrayList<Integer> arr){
        for(int i =0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        int Range_L = 1;
        int Range_R = 5;
        int k =2;

        ArrayList<Integer> addElements = new ArrayList<>();

        for (int i =Range_L; i<=Range_R; i++){
            if (i%2 != 0) {
                addElements.add(i);

            }
        }  
        Collections.reverse(addElements);
    
        int count =0;

        for (int i = 0; i<addElements.size(); i++) {
 
            if (i == k-1) {
                System.out.println(addElements.get(i));
                break;
            }
            if (k > addElements.size()) {
                System.out.println("Invaild Input of K");
                return;
            }
            

        }

    }
}
