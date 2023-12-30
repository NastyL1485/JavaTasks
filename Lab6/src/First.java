import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class First {
    String filePath = "text.txt";
    Map<String, Integer> wordFrequencyMap = new HashMap<>();
        try (var reader = Files.newBufferedReader(Path.of(filePath), StandardCharsets.UTF_8)) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");

            for (String word : words) {

                word = word.toLowerCase();

                word = word.replaceAll("[^a-zA-Zа-яА-Я]", "");

                if (!word.isEmpty()) {
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        }
        reader.close();
    }
        catch (IOException e) {
        e.printStackTrace();
    }
    int topN = 10;
        wordFrequencyMap.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
            .limit(topN)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
}
}
