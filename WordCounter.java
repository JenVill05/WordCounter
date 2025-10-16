// WordCounter.java

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence or phrase: ");
        String input = scanner.nextLine();

        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = input.trim().split("\\s+");

        // Check for empty input
        if (input.trim().isEmpty()) {
            System.out.println("No words found.");
        } else {
            System.out.println("Number of words: " + words.length);
        }

        scanner.close();
    }
}
