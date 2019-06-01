import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharCounter {
    private static String string = "Process finished with exit code 0";

    public static void main(String[] args) {

        String[] strArray = string.split("");

        Map<String, Long> map =  Arrays.stream(strArray)
                .collect(Collectors.groupingBy(String::toUpperCase , Collectors.counting()));


        map.entrySet().forEach(System.out::println);
    }

}
