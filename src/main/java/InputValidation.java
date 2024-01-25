import java.util.Scanner;

public class InputValidation {
    private static Scanner scanner = new Scanner(System.in);
    public static void validateInput(String input) {
        if (input.length() != 1){
            System.out.println("Adios");
            input = scanner.next();
            validateInput(input);
        }
    }
}
