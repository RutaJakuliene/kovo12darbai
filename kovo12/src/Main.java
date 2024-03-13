import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      // Sukuriamas String tipo sąrašas
        List<String> words = Arrays.asList("apple", "bananas", "orange", "kiwi", "grapes");
        // Skaičiuojame, kiek sąraše yra eilučių, kurių ilgis yra didesnis nei 5 simboliai
        long count = words.stream()
       .filter(word -> word.length() > 5)
       .count();

     // Spausdiname rezultatą
        System.out.println("Sąraše yra " + count + " eilutės (-čių), kurių ilgis yra didesnis nei 5 simboliai.");
    }
}