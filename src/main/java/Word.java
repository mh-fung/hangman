import java.util.Arrays;

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
        System.out.println("Welcome welcome welcome!");
        System.out.println("This is the word you have to guess");
        this.setAnswerArray(word);
        this.setPlayerArray(word);
        System.out.println(playerArray);
        System.out.println("Please choose the difficulty level: 1 for easy (8 lives), 2 for difficult (4 lives)");
    }
}
