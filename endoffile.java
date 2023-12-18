
 import java.io.*;
import java.util.*;


public class endoffile {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input until EOF
        int lineNumber = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        // Close the scanner
        scanner.close();
    }
}

    

