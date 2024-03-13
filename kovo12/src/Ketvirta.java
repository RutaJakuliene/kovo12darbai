import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ketvirta {
    public static void main(String[] args) {
        // Sukuriamas pradinis String tipo sąrašas
        List<String> words = Arrays.asList("apple", "bananas", "avocado", "orange", "kiwi", "grapes", "apricots");
        // Atfiltruojame žodžius, kurie prasideda raide "a", ir juos sujungiame į naują String kintamąjį
        String result = words.stream()
                .filter(word -> word.startsWith("a"))
                .collect(Collectors.joining(", "));
       // Spausdiname rezultatą
        System.out.println("Words starting with 'a': " + result);
   }
}
