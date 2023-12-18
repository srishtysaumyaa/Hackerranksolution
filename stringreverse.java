
 import java.io.*;
import java.util.*;


public class stringreverse {
   


 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String s = scanner.next();

        // Check if the string is a palindrome
        String result = isPalindrome(s) ? "Yes" : "No";

        // Print the result
        System.out.println(result);

        scanner.close();
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Compare characters from the beginning and end of the string
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Not a palindrome
            }

            left++;
            right--;
        }

        return true; // Palindrome
    }
}
       

    

