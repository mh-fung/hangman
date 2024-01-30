import java.security.DigestInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Words words = new Words();
        Word word = new Word(words.getWord());
        word.setUp();
        int chosenLevel = scanner.nextInt();
        InputValidator validatorForLevel = new InputValidator();
        chosenLevel = validatorForLevel.validateLevel(chosenLevel);
        if(chosenLevel == 1) {
            Easy easy = new Easy();
            easy.setLives();
            easy.printIntro();
        while (!easy.completeGame) {
            easy.verifyLetter(word.answerArray, word.playerArray);
        }
        } else if (chosenLevel == 2) {
            Difficult difficult = new Difficult();
            difficult.setLives();
            difficult.printIntro();
            while (!difficult.completeGame) {
                difficult.verifyLetter(word.answerArray, word.playerArray);
            }
        }
    }
}
