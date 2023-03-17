import java.util.*;

class Print {
    int order;
    int hierarchy;

    public Print(int order, int hierarchy) {
        this.order = order;
        this.hierarchy = hierarchy;
    }

    public int getOrder() {
        return order;
    }

    public int getHierarchy() {
        return hierarchy;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            Queue<Print>queue = new LinkedList<>();
            int n = sc.nextInt();
            int goal = sc.nextInt();
            int answer =1;
            List<Integer>numbers = new ArrayList<>();

            for(int j=0;j<n;j++){
                int input = sc.nextInt();
                queue.add(new Print(j, input));
                numbers.add(input);
            }

            numbers.sort(Collections.reverseOrder());

            while(true){
                if(queue.peek().getHierarchy() == numbers.get(0)){
                    if(queue.peek().getOrder() == goal){
                        System.out.println(answer);
                        break;
                    }
                    queue.poll();
                    numbers.remove(0);
                    answer++;
                    continue;
                }
                queue.add(queue.poll());
            }
        }
    }
}
