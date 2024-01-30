import java.util.Arrays;
import java.util.Scanner;

public abstract class Game {

    private final Scanner scanner = new Scanner(System.in);
    protected boolean completeGame = false;
    protected int lives;
    private boolean match = false;

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }

    public void verifyLetter(char[] answerArray, char[] playerArray) {
        String playerInput = scanner.next();
        HangManDisplay hangManDisplay = new HangManDisplay();
        InputValidator inputValidator = new InputValidator();
        String validatedLetter = inputValidator.validateInput(playerInput);
        this.setMatch(false);
        //loop through the answer array and change the player array
        for (int i=0;i<answerArray.length;i++) {
            if(validatedLetter.charAt(0) == answerArray[i]) {
                playerArray[i] = answerArray[i];
                this.setMatch(true);
                System.out.println("Nice work!");
            }
        }
        if(!match) {
            lives--;
            System.out.println("Try again");
            hangManDisplay.printHangMan(lives);
        }
        System.out.println(playerArray);
        if (Arrays.equals(playerArray, answerArray)) {
            System.out.println("Congratulations!");
            completeGame = true;
        } else if (lives == 0) {
            hangManDisplay.printHangMan(lives);
            completeGame = true;
        }
    }

    public abstract void setLives();
    public void printIntro() {
        System.out.println("You have chosen the " + this.getClass().getSimpleName() + " level!!");
        System.out.println("And you can start now. Guess the word by entering one letter at a time!");
    };
}
