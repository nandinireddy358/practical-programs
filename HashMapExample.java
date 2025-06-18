import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Diana", 90);

        // Retrieving a value by key
        System.out.println("Grade for Bob: " + studentGrades.get("Bob"));

        // Iterating over all entries in the HashMap
        System.out.println("All student grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
