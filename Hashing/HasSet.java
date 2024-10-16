import java.util.*;
public class HasSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet();

        cities.add("Delhi");
        cities.add("Surat");
        cities.add("Kolkata");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Surat");
        lhs.add("Kolkata");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Bangulaor");
        ts.add("India");
        ts.add("China");

        System.out.println(ts);


        // Iterator it = cities.iterator();

        // while (it.hasNext()) {
        //     System.err.println(it.next());
        // }


        // for(String city : cities)
        // {
        //     System.out.println(city);
        // }

            
        
    }
}
