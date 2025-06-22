import java.util.*;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + output);
    }
}
