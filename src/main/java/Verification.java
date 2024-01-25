import java.util.Arrays;
import java.util.Scanner;

public class Verification {

    private static Scanner scanner = new Scanner(System.in);
    protected static boolean completeGame = false;

    public static void verifyLetter(char[] answerArray, char[] playerArray) {
        String playerInputLetter = scanner.next();
        InputValidation.validateInput(playerInputLetter);
        boolean match = false;
        //loop through the answer array and change the player array
        for (int i=0;i<answerArray.length;i++) {
            if(playerInputLetter.charAt(0) == answerArray[i]) {
                playerArray[i] = answerArray[i];
                match = true;
            }
        }
        if(!match) {
            System.out.println("Try again");
        }
        System.out.println(playerArray);
        if (Arrays.equals(playerArray, answerArray)) {
            completeGame = true;
        }
    }
}
