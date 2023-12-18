package hackerank;
import java.io.*;
import java.util.*;


public class anagram {
    


     static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase for case-insensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if the lengths are equal
        if (a.length() != b.length()) {
            return false;
        }

        // Use a map to count character frequencies in string 'a'
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : a.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Compare character frequencies in string 'b' with the map
        for (char c : b.toCharArray()) {
            if (!frequencyMap.containsKey(c) || frequencyMap.get(c) == 0) {
                return false; // Character not found or frequency exhausted
            } else {
                frequencyMap.put(c, frequencyMap.get(c) - 1);
            }
        }

        return true; // Strings are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        String a = scanner.next();
        String b = scanner.next();

        // Check if strings are anagrams
        boolean result = isAnagram(a, b);

        // Print the result
        System.out.println(result ? "Anagrams" : "Not Anagrams");

        scanner.close();
    }
}

    

