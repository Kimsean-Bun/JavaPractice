import java.util.Scanner;
import java.util.Random;

    public class Timer {
        // User types the text
         System.out.println("Type the text:");
        long startTime = System.currentTimeMillis();
        String userInput = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        // Calculate elapsed time in seconds
        long elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000.0;
        int originalTextLength = originalText.length();
        int userInputLength = userInput.length();
        int correctCharacters = 0;

        // Compare the user's input with the original text to count correct characters
         for(
        int i = 0; i<Math.min(originalTextLength,userInputLength);i++)

        {
            if (originalText.charAt(i) == userInput.charAt(i)) {
                correctCharacters++;
            }
        }
    }