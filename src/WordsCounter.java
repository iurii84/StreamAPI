import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsCounter {
    private static ArrayList<String> words = new ArrayList<>();

    static {
        words.add("Car");
        words.add("TV");
        words.add("CaR");
        words.add("Lamp");
        words.add("pc");
        words.add("LAMP");
        words.add("CAR");
        words.add("lamp");
        words.add("PC");
        words.add("car");
    }

    public static void main(String[] args) {
        WordsCounter counter = new WordsCounter();
        Map<String, Long> objectsMap = counter.counter(words);
        System.out.println(objectsMap);
    }

    Map<String, Long> counter(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::toUpperCase, Collectors.counting()));
    }
}
