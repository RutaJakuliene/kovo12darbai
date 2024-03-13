import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Trecia {
    public static void main(String[] args) {
        // Sukuriame pradinį String tipo sąrašą
        List<String> words = Arrays.asList("apple", "bananas", "orange", "kiwi", "grapes");
        // Konvertuojame sąraše esančius žodžius į didžiąsias raides ir išsaugome naujame sąraše
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        // Spausdiname rezultatą
        System.out.println("Uppercase words: " + uppercaseWords);
    }
}
