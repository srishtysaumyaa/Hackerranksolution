

import java.util.Scanner;

public class substring {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        
        String s = scanner.nextLine();

        
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Print the substring in the inclusive range from start to end
        String substring = getSubstring(s, start, end);
        System.out.println(substring);

        scanner.close();
    }

    private static String getSubstring(String s, int start, int end) {
        // Check for valid indices
        if (start < 0 || end > s.length() || start > end) {
            return "Invalid indices";
        }

        // Use the substring method to extract the specified substring
        return s.substring(start, end);
    }
}

    

