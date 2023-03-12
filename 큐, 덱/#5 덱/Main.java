import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Deque<Integer> deque = new ArrayDeque<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());
        int count = Integer.parseInt(token.nextToken());

        for (int i = 0; i < count; i++) {
            token = new StringTokenizer(reader.readLine(), " ");
            String input = token.nextToken();
            if (input.startsWith("push")) {
                if (input.startsWith("push_back")) {
                    deque.addLast(Integer.valueOf(token.nextToken()));
                    continue;
                }
                deque.addFirst(Integer.valueOf(token.nextToken()));
                continue;
            }

            if (input.startsWith("pop")) {
                if(deque.isEmpty()){
                    System.out.println(-1);
                    continue;
                }
                if (input.equals("pop_back")) {
                    System.out.println(deque.pollLast());
                    continue;
                }
                if (input.equals("pop_front")) {
                    System.out.println(deque.poll());
                    continue;
                }
            }

            if (input.startsWith("s")) {
                System.out.println(deque.size());
                continue;
            }
            if (input.startsWith("e")) {
                if (deque.isEmpty()) {
                    System.out.println(1);
                    continue;
                }
                System.out.println(0);
                continue;
            }
            if (input.startsWith("f")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(deque.peek());
                continue;
            }
            if (input.startsWith("b")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(deque.peekLast());
            }

        }
    }
}
