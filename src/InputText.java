import java.util.Scanner;

public class InputText {
    public static void UserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the following text:");
        System.out.println(originalText);
        System.out.println();

        // Prompt user to start the test
        System.out.println("Press Enter when you are ready to start the test.");
        scanner.nextLine();

        // User types the text
        System.out.println("Type the text:");

    }
    public static void CalculateResult(){
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        String userInput = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        // Calculate elapsed time in seconds
        long elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000.0;
        // Compare the user's input with the original text to count correct characters


        // Calculate accuracy as a percentage
        int accuracy = (int) (((double) correctCharacters / originalTextLength) * 100);

        // Calculate words per minute
        double wordsPerMinute = (userInputLength / 5.0) / (seconds / 60);
    }
    public int originalTextLength(){

        int originalTextLength = originalText.length();
        return originalTextLength;
    }
    public static int correctCharacters(){
        int userInputLength = userInput.length();
        int correctCharacters = 0;
        for (int i = 0; i < Math.min(originalTextLength(), userInputLength); i++) {
            if (originalText.charAt(i) == userInput.charAt(i)) {
                correctCharacters++;
            }
        }
        return correctCharacters;
    }
    public static int accuracy(){
        int accuracy = (int) (((double) correctCharacters() / originalTextLength) * 100);
    }
}
