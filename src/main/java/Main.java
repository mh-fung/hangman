import java.security.DigestInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Words words = new Words();
        Word word = new Word(words.getWord());
        word.setUp();
        Easy easy = new Easy();
        easy.setLives();
        Difficult difficult = new Difficult();
        difficult.setLives();
        int chosenLevel = scanner.nextInt();
        InputValidator validatorForLevel = new InputValidator();
        chosenLevel = validatorForLevel.validateLevel(chosenLevel);
        if(chosenLevel == 1) {
            System.out.println("You have chosen the easy level!");
        while (!easy.completeGame) {
            easy.verifyLetter(word.answerArray, word.playerArray);
        }
        } else if (chosenLevel == 2) {
            System.out.println("You have chosen the difficult level!");
            while (!difficult.completeGame) {
                difficult.verifyLetter(word.answerArray, word.playerArray);
            }
        }
    }
}
