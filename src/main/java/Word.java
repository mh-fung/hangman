import java.util.Arrays;
import java.util.Objects;

public class Word {
    private String word;
    protected char[] answerArray;
    protected char[] playerArray;

    public Word(String word) {
        this.word = word;
    }

    private void setAnswerArray(String word) {
        answerArray = word.toCharArray();
    }

    private void setPlayerArray(String word) {
        playerArray = word.toCharArray();
        Arrays.fill(playerArray, '_');
    }

    public void setUp() {
        this.setAnswerArray(word);
        this.setPlayerArray(word);
        System.out.println("Welcome welcome welcome!");
        System.out.println("This is the word you have to guess");
        System.out.println(playerArray);
        if (Objects.equals(word, "hei")) {
            System.out.println("HINT: You should know who I am!!!!");
        }
        System.out.println("Please choose the difficulty level: 1 for easy (8 lives), 2 for difficult (4 lives)");
    }
}
