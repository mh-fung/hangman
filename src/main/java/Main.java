public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome welcome welcome!");
        String word = Words.getWord();
        System.out.println(word);
        Display.printEmptySpace(word);
        Verification.verifyLetter(word);
    }

}
