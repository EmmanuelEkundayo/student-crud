package src.main.java.com.example.speakwithfiles;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SpeakWithFilesApplication{

    public static void main(String[] args) {
        String filePath = "SpeakWithFiles/src/main/resources/practice.txt";
        int lineToEdit = 2;
        String newText = "Learned!!";

        try {
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);
            if (lineToEdit - 1 < lines.size()) {
                lines.set(lineToEdit - 1, newText);
            } else {
                System.out.println("Line number out of range.");
                return;
            }
            Files.write(path, lines);
            System.out.println("File updated successfully.");

        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }
    }
}
