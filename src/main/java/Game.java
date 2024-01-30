import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class Game {

    private final Scanner scanner = new Scanner(System.in);
    protected boolean completeGame = false;
    protected int lives;
    private boolean match = false;
    private List<String> guessedLetters = new ArrayList<>();

    public void setMatch(boolean match) {
        this.match = match;
    }

    public void verifyLetter(char[] answerArray, char[] playerArray) {
        String playerInput = scanner.next();
        HangManDisplay hangManDisplay = new HangManDisplay();
        Validator inputValidator = new Validator();
        String validatedLetter = inputValidator.validateInput(playerInput, guessedLetters);
        guessedLetters.add(validatedLetter);
        this.setMatch(false);
        for (int i=0;i<answerArray.length;i++) {
            if(validatedLetter.charAt(0) == answerArray[i]) {
                playerArray[i] = answerArray[i];
                this.setMatch(true);
                System.out.println("Nice work!");
            }
        }
        if(!match) {
            lives--;
            System.out.println("Sorry! Wrong guess");
            hangManDisplay.printHangMan(lives);
        }
        System.out.println("Guessed Letters: " + guessedLetters);
        System.out.println(playerArray);
        if (Arrays.equals(playerArray, answerArray)) {
            System.out.println("Congratulations!");
            completeGame = true;
        } else if (lives == 0) {
            hangManDisplay.printHangMan(lives);
            System.out.print("The answer is...... ");
            System.out.println(answerArray);
            completeGame = true;
        }
    }

    public abstract void setLives();
    public void printIntro() {
        System.out.println("You have chosen the " + this.getClass().getSimpleName() + " level!!");
        System.out.println("And you can start now. Guess the word by entering one letter at a time!");
    };
}
