public class Display {
    private String word;
    public static void printEmptySpace(String word) {
        for (int i = 0; i<word.length();i++) {
            System.out.print("_ ");
        }
    }
}
