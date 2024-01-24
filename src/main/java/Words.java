import java.util.ArrayList;
import java.util.List;

public class Words {
    private static final List<String> words = new ArrayList<>();

    static {
//        words.add("apple");
//        words.add("orange");
//        words.add("tree");
//        words.add("water");
//        words.add("phone");
        words.add("rich");
        words.add("hei");
    }
    public static String getWord() {
        return words.get((int) (Math.random() * words.size()));
    }
}
