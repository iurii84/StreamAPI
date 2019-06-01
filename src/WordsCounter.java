import java.util.ArrayList;
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
        Map<String, Long> objectsMap = words.stream()
                .collect(Collectors.groupingBy(e -> e.toUpperCase(), Collectors.counting()));


        System.out.println(objectsMap);
    }




}
