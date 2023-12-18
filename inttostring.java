
import java.io.*;
import java.util.*;

public class inttostring {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer
        int n = scanner.nextInt();

        // Convert the integer to a string
        String s = Integer.toString(n);

        // Check if the conversion is correct
        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

        // Close the scanner
        scanner.close();
    }
}

    

