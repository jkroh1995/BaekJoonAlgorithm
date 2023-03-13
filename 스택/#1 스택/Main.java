import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());
        int count = Integer.parseInt(token.nextToken());

        for (int i = 0; i < count; i++) {
            token = new StringTokenizer(reader.readLine(), " ");
            String input = token.nextToken();
            if (input.startsWith("push")) {
                stack.add(Integer.valueOf(token.nextToken()));
                continue;
            }

            if (input.startsWith("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(stack.pop());
                continue;
            }

            if (input.startsWith("s")) {
                System.out.println(stack.size());
                continue;
            }

            if (input.startsWith("e")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                    continue;
                }
                System.out.println(0);
                continue;
            }
            if (input.startsWith("t")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(stack.peek());
            }
        }
    }
}
