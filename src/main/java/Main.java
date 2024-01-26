import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Words words = new Words();
        Word word = new Word();
        word.setWord(words.getWord()); //getting the word from the word list
        word.intro();
        char[] answerArray = word.toCharArray();
        char[] playerArray = new char[answerArray.length];
        Arrays.fill(playerArray, '_');
        while (!Verification.completeGame) {
        Verification.verifyLetter(answerArray, playerArray);
        }
    }
}
