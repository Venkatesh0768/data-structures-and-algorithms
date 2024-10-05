import java.util.ArrayList;

public class question2 {
    public static void main(String[] args) {
        int Range_L = 7;
        int Range_R = 20;
        int k =2;

        ArrayList<Integer> addElements = new ArrayList<>();

        for (int i =Range_L; i<=Range_R; i++){
            if (i%2 != 0) {
                addElements.add(i);
            }
        }

        // for(int i =0; i<addElements.size(); i++){
        //     System.out.println(addElements.get(i));
        // 
        int count =0;

        for(int i =Range_R;  i>=0; i++){
           if (addElements.get(i)%2 != 0) {
                count++;
       
           }
           if (count ==k) {
            System.out.println(addElements.get(i));
             return;
           }
        }
      


    }
}
