import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class WordsCounterTest {
    private static List<String> testWords = new ArrayList<>();
    private static Map<String, Long> expectedMap = new HashMap<>();
    private static WordsCounter wordsCounter = new WordsCounter();
    private static Map<String, Long> actualMap;


    @BeforeAll
    static void init() {

        testWords.add("Car");
        testWords.add("CaR");
        testWords.add("Lamp");

        expectedMap.put("CAR", 2L);
        expectedMap.put("LAMP", 1L);

        actualMap = wordsCounter.counter(testWords);
    }

    @Test
    void sizeTest() {
        assertEquals(expectedMap.size(), actualMap.size());
    }

    @Test
    void dataTest() {
        assertEquals(expectedMap.entrySet(), actualMap.entrySet());
    }

    @Test
    void notNull() {
        assertNotNull(actualMap);
    }
}