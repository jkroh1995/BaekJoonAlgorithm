import java.util.*;
import java.util.regex.Pattern;

public class Main {

    static String pattern = "^[0-9]*$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, String> pokemonNumber = new HashMap<>();
        Map<String, Integer> pokemonName = new HashMap<>();


        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            pokemonNumber.put(i, name);
            pokemonName.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String input = sc.next();
            if (Pattern.matches(pattern, input)) {
                System.out.println(pokemonNumber.get(Integer.parseInt(input)));
                continue;
            }
            System.out.println(pokemonName.get(input));
        }
    }
}
