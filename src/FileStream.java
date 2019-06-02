import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStream {
    private static List<String> arrayOfCities = new ArrayList<>();

    public static void main(String[] args) {
        Path cities = Paths.get("C:\\Users\\iurii\\Desktop\\Intership\\streamAPI\\src\\MyTextFile.txt");
        try (Stream<String> cityStream = Files.newBufferedReader(cities).lines()) {
            arrayOfCities = cityStream
                    .sorted()
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        arrayOfCities.forEach(System.out::println);
    }
}
