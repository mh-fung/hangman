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
            System.out.println("Remaining live(s): " + lives);
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

    public abstract void setLives();
}
