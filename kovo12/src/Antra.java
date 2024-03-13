import java.util.Arrays;
import java.util.List;

public class Antra {
    public static void main(String[] args) {
    // Sukuriamas Integer tipo sąrašas
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Apskaičiuojame skaičių sumą sąraše
        int sum = numbers.stream()
                .mapToInt(Integer::intValue) // Paverčiame Integer objektus į primityvius int tipo skaičius
                .sum();
        // Spausdiname rezultatą
        System.out.println("Skaičių suma sąraše yra: " + sum);
    }
}