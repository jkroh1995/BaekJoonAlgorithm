import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            Stack<String> stack = new Stack<>();
            for (String word : input.split("")) {
                if (stack.empty()) {
                    stack.add(word);
                    continue;
                }
                if (stack.peek().equals("(") && word.equals(")")) {
                    stack.pop();
                    continue;
                }
                stack.add(word);
            }
            if (stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
