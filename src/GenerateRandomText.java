import java.util.Scanner;
import java.util.Random;

public class GenerateRandomText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("How many minute of text do you want to type?");
            System.out.println("1 Minute, 3 Minutes, and 5 Minutes");
            int textMinuteChoice = scanner.nextInt();
            scanner.nextLine();

            String originalText;
            if (textMinuteChoice == 1){
                originalText = oneMinute[random.nextInt(oneMinute)]
            }
        }
    }
}

