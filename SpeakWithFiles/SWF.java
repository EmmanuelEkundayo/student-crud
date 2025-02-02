import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SWF {
    public static void main(String[] args) {
        String filePath = "src/main/resources/practice.txt";
        int lineToEdit = 1;
        String newText = "Learned!!";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            if (lineToEdit - 1 >= 0 && lineToEdit - 1 < lines.size()) {
                lines.set(lineToEdit - 1, newText);
            } else {
                System.out.println("Line number out of range.");
                return;
            }
            Files.write(Paths.get(filePath), lines);
            System.out.println("File updated successfully.");

        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }
    }
}