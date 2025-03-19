import java.util.Scanner;

public class WordCounter {

    // Main method - Entry point of the program
    public static void main(String[] args) {
        // Get the sentence input from the user
        String sentence = getSentenceInput();

        // Count the number of words in the sentence
        int wordCount = countWords(sentence);

        // Display the word count
        System.out.println("The sentence has " + wordCount + " words.");
    }

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in); // Scanner for 
