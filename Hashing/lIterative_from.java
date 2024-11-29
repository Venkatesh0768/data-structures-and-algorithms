import java.util.*;
public class lIterative_from {

    public static String getStart(HashMap<String , String> tickets){

        HashMap<String, String> revMap = new HashMap<>();

        // Reverse the map, so we can look up destinations and find the source
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // Find the starting point, which won't appear as a destination in revMap
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {


        HashMap<String, String> set = new HashMap<>();

        // Setting the input tickets
        set.put("Chennai", "Bangaluru");
        set.put("Mumbai", "Delhi");
        set.put("Goa", "Chennai");  // Removed extra space after "Goa"
        set.put("Delhi", "Goa");

        // Getting the starting city
        String start = getStart(set);
        System.out.println("Starting point: " + start);

        // Printing the full travel route
        while (set.containsKey(start)) {
            System.out.print( " -> " + set.get(start) + " ");
            start = set.get(start);
        }

        System.out.println();

    }
    
}
