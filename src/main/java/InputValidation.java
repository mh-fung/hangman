import java.util.Scanner;

public class InputValidation {
    private static Scanner scanner = new Scanner(System.in);
    public static String validateInput(String input) {
        if (input.length() != 1){
            System.out.println("Please enter one character only");
            input = scanner.next();
            validateInput(input);
        }
        return input.toLowerCase();
    }
}
