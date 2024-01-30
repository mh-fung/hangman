import java.util.ArrayList;
import java.util.List;

public class Words {
    private static final List<String> words = new ArrayList<>();

    static {
        words.add("apple");
        words.add("orange");
        words.add("tree");
        words.add("water");
        words.add("phone");
        words.add("rich");
        words.add("hei");
        words.add("idea");
        words.add("wine");
        words.add("whisky");
        words.add("food");
        words.add("run");
        words.add("abstraction");
        words.add("encapsulation");
        words.add("inheritance");
        words.add("polymorphism");

    }
    public String getWord() {
        return words.get((int) (Math.random() * words.size()));
    }
}
