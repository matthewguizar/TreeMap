import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main{

    public static void main(String[] args) {
        
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        map.put(10, "ten");
        map.put(3, "three");
        map.put(5, "five");
        map.put(1, "one");
        map.put(8, "eight");

        //O(logN)
        System.out.println("Largest key: " + map.firstKey());
        System.out.println("Smallest Key: " + map.lastKey());

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }
    }

}