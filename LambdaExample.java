import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        // Predicate: Filter names longer than 3 characters
        Predicate<String> lengthGreaterThan3 = name -> name.length() > 3;

        // Function: Convert name to uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();

        // Consumer: Print greeting message
        Consumer<String> printGreeting = name -> System.out.println("Hello, " + name + "!");

        // Process the list:
        // 1. Filter names longer than 3 characters
        // 2. Convert them to uppercase
        // 3. Print greeting for each
        List<String> processedNames = names.stream()
                .filter(lengthGreaterThan3)
                .map(toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Processed Names: " + processedNames);

        System.out.println("Greetings:");
        processedNames.forEach(printGreeting);
    }
}
