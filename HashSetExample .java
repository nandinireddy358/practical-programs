import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store unique numbers
        HashSet<Integer> numbers = new HashSet<>();

        // Adding elements to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);  // Duplicate, will not be added

        // Check if an element exists
        System.out.println("Does the set contain 20? " + numbers.contains(20));
        System.out.println("Does the set contain 40? " + numbers.contains(40));

        // Print all elements in the HashSet
        System.out.println("Elements in the HashSet:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
