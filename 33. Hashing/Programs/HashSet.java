import java.util.*;
public class HashSet {
    public static void main(String args[]){
        // HashMap does not maintain any specific order
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("nepal", 5);

        // LinkedHashMap maintains insertion order
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 100);
        lhm.put("china", 150);
        lhm.put("us", 50);
        lhm.put("nepal", 5);

        // TreeMap sorts keys in natural order (ascending order for Strings)
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("india", 100);
        tm.put("china", 150);
        tm.put("us", 50);
        tm.put("nepal", 5);

        // Demonstrating the difference in order
        System.out.println("HashMap (Unordered): " + hm);
        System.out.println("LinkedHashMap (Insertion Order): " + lhm);
        System.out.println("TreeMap (Sorted Order): " + tm);
    }
}