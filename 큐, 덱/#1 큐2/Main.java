import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Deque<Integer> deque = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(token.nextToken());

        for (int i = 0; i < count; i++) {
            token = new StringTokenizer(reader.readLine(), " ");
            String input = token.nextToken();
            if (input.startsWith("pu")) {
                deque.add(Integer.valueOf(token.nextToken()));
                continue;
            }

            if (input.startsWith("po")) {
                if(deque.isEmpty()){
                    sb.append("-1\n");
                    continue;
                }
                sb.append(deque.poll()).append("\n");
                continue;
            }

            if (input.startsWith("s")) {
                sb.append(deque.size()).append("\n");
                continue;
            }
            if (input.startsWith("e")) {
                if (deque.isEmpty()) {
                    sb.append("1\n");
                    continue;
                }
                sb.append("0\n");
                continue;
            }
            if (input.startsWith("f")) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                    continue;
                }
                sb.append(deque.peek()).append("\n");
                continue;
            }
            if (input.startsWith("b")) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                    continue;
                }
                sb.append(deque.peekLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
