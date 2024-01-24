import java.util.Arrays;
import java.util.Scanner;

public class Verification {
    private String word;
    private static Scanner scanner = new Scanner(System.in);
    public static void verifyLetter(String word) {
        char[] answerArray = word.toCharArray();
        char[] playerArray = new char[answerArray.length];
        Arrays.fill(playerArray, '_');
        System.out.println(playerArray);
        String playerInputLetter = scanner.next();
        for (int i=0;i<answerArray.length;i++) {
            if(playerInputLetter.charAt(0) == answerArray[i]) {
                playerArray[i] = answerArray[i];
                System.out.println(playerArray);
            } else {
                System.out.println("Try again");
            }
            playerInputLetter = scanner.next();
        }
     }
}
