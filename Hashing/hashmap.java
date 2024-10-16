/**
 * hashmap
 */
import java.util.*;;
public class hashmap {

    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("USA", 40);

        hm.remove("India");
        System.out.println(hm);

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("south korea"));

        //size
        System.out.println(hm.size());

    }  
 }