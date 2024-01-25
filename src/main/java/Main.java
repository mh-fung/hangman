import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome welcome welcome!");
        String word = Words.getWord();
        System.out.println(word);
        Display.printEmptySpace(word);
        char[] answerArray = word.toCharArray();
        char[] playerArray = new char[answerArray.length];
        Arrays.fill(playerArray, '_');
        while (!Verification.completeGame) {
        Verification.verifyLetter(answerArray, playerArray);
        }
    }

}
