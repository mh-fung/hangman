import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validator {
    private final Scanner scanner = new Scanner(System.in);

    public String validateInput(String input, List<String> guessedLetters) {
        if (input.length() != 1){
            System.out.println("Please enter one character only");
            input = scanner.next();
            validateInput(input, guessedLetters);
        }
        if (guessedLetters.contains(input)) {
            System.out.println("You have guessed this letter already, please choose another one");
            input = scanner.next();
            validateInput(input, guessedLetters);
        }
        return input.toLowerCase();
    }
    public int validateLevel(int input) {
        if (input != 1 && input !=2){
            System.out.println("Please enter 1 or 2");
            input = scanner.nextInt();
            validateLevel(input);
        }
        return input;
    }
}
