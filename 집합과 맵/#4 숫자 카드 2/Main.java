import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class Main {

    static String pattern = "^[0-9]*$";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Map<Integer, Integer> cards = new HashMap<>();
        for(int i=0;i<N;i++){
            int input = Integer.parseInt(st.nextToken());
            if(cards.containsKey(input)){
                cards.replace(input, cards.get(input)+1);
                continue;
            }
            cards.put(input,1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++){
            int input = Integer.parseInt(st.nextToken());
            if(cards.containsKey(input)){
                sb.append(cards.get(input)).append(" ");
                continue;
            }
            sb.append(0).append(" ");
        }

        System.out.println(sb);
    }
}
