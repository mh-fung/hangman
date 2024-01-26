public class Word {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void intro() {
        System.out.println("here is the" + word);
        System.out.println("Welcome welcome welcome!");
        for (int i = 0; i<word.length();i++) {
            System.out.print("_");
        }
        System.out.println(" ");
    }

    public char[] toCharArray() {
        return word.toCharArray();
    }
}
