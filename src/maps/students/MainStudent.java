package maps.students;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainStudent {
    public static void main(String[] args) {
        Map<String, Integer> nameToGrade = new HashMap<>();
        Map.Entry<String,Integer> maxGrade = null;
        nameToGrade.put("Mihai", 9);
        nameToGrade.put("George", 5);
        nameToGrade.put("Ionela", 7);
        System.out.println(nameToGrade);

        Set<Map.Entry<String, Integer>> entries = nameToGrade.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        for(Map.Entry<String,Integer> price:nameToGrade.entrySet()) {
            if (maxGrade == null || price.getValue().compareTo(maxGrade.getValue()) > 0) {
                maxGrade = price;
            }
        }
        System.out.println("Highest grade is: "+maxGrade.getValue());

    }
}