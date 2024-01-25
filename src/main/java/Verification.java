import java.util.Arrays;
import java.util.Scanner;

public class Verification {

    private static Scanner scanner = new Scanner(System.in);
    protected static boolean completeGame = false;
    private static int lives = 8;

    public static void verifyLetter(char[] answerArray, char[] playerArray) {
        String playerInput = scanner.next();
        String validatedLetter = InputValidation.validateInput(playerInput);
        boolean match = false;
        //loop through the answer array and change the player array
        for (int i=0;i<answerArray.length;i++) {
            if(validatedLetter.charAt(0) == answerArray[i]) {
                playerArray[i] = answerArray[i];
                match = true;
            }
        }
        if(!match) {
            lives--;
            System.out.println("Try again");
            System.out.println(lives);
        }
        System.out.println(playerArray);
        if (Arrays.equals(playerArray, answerArray)) {
            System.out.println("Congratulations!");
            completeGame = true;
        } else if (lives == 0) {
            System.out.println("Sorry!");
            completeGame = true;
        }
    }
}
