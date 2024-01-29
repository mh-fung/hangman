import java.util.Scanner;

public class InputValidator {
    private final Scanner scanner = new Scanner(System.in);
    public String validateInput(String input) {
        if (input.length() != 1){
            System.out.println("Please enter one character only");
            input = scanner.next();
            validateInput(input);
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
