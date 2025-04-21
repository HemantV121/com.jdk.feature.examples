import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Filter and display names that start with "A"
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}